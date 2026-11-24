package com.mini_ecommerce_jdbc.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mini_ecommerce_jdbc.config.DBConnection;
import com.mini_ecommerce_jdbc.exception.DatabaseOperationException;
import com.mini_ecommerce_jdbc.exception.InsufficientStockException;
import com.mini_ecommerce_jdbc.exception.InvalidCustomerIdException;
import com.mini_ecommerce_jdbc.exception.InvalidOrderException;
import com.mini_ecommerce_jdbc.exception.InvalidOrderIdException;
import com.mini_ecommerce_jdbc.exception.OrderNotFoundException;
import com.mini_ecommerce_jdbc.exception.ProductNotFoundException;
import com.mini_ecommerce_jdbc.model.Cart;
import com.mini_ecommerce_jdbc.model.OrderItem;
import com.mini_ecommerce_jdbc.model.OrderStatus;
import com.mini_ecommerce_jdbc.model.Orders;
import com.mini_ecommerce_jdbc.model.PaymentStatus;
import com.mini_ecommerce_jdbc.model.Product;
import com.mini_ecommerce_jdbc.repository.CartRepository;
import com.mini_ecommerce_jdbc.repository.OrderRepository;
import com.mini_ecommerce_jdbc.repository.ProductRepository;

public class OrderService {

	private OrderRepository orderRepository = new OrderRepository();

	private CartRepository cartRepository = new CartRepository();

	private ProductRepository productRepository = new ProductRepository();

	// Place Order
	public void placeOrder(int customerId) throws SQLException {

		// 1. Validate customer ID
		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		// 2. Get customer's cart
		List<Cart> cartList = cartRepository.viewCart(customerId);

		if (cartList == null || cartList.isEmpty()) {
			throw new ProductNotFoundException("Cart is empty");
		}

		System.out.println("===== CART BEFORE ORDER =====");

		for (Cart cartItem : cartList) {
			System.out.println("Product ID : " + cartItem.getProductId());
			System.out.println("Quantity   : " + cartItem.getQuantity());
		}

		System.out.println("=============================");
		Connection connection = null;

		try {

			// 3. Start transaction
			connection = DBConnection.getConnection();
			connection.setAutoCommit(false);

			int totalAmount = 0;

			List<OrderItem> orderItems = new ArrayList<>();

			// 4. Validate products and stock
			for (Cart cartItem : cartList) {

				Product product = productRepository.getProductById(cartItem.getProductId());

				// Product validation
				if (product == null) {
					throw new ProductNotFoundException("Product not found with ID: " + cartItem.getProductId());
				}

				// Stock validation
				if (product.getStockQuantity() < cartItem.getQuantity()) {

					throw new InsufficientStockException("Insufficient stock for product: " + product.getProductName()
							+ ". Available stock: " + product.getStockQuantity());
				}

				// Calculate total
				totalAmount += product.getPrice() * cartItem.getQuantity();

				// Prepare OrderItem
				OrderItem orderItem = new OrderItem(cartItem.getProductId(), cartItem.getQuantity(),
						product.getPrice());

				orderItems.add(orderItem);
			}

			// 5. Create parent order
			Orders order = new Orders(customerId, totalAmount, OrderStatus.CONFIRMED, PaymentStatus.PENDING);

			int orderId = orderRepository.createOrder(order, connection);

			// 6. Insert order items
			orderRepository.saveOrderItemBatch(orderId, orderItems, connection);

			// 7. Reduce product stock
			for (Cart cartItem : cartList) {

				Product product = productRepository.getProductById(cartItem.getProductId());

				int remainingStock = product.getStockQuantity() - cartItem.getQuantity();

				boolean stockUpdated = productRepository.updateProductStock(cartItem.getProductId(), remainingStock,
						connection);

				if (!stockUpdated) {
					throw new DatabaseOperationException(
							"Failed to update stock for Product ID: " + cartItem.getProductId());
				}
			}

			// 8. Clear cart
			orderRepository.clearCart(customerId, connection);

			// 9. Commit transaction
			connection.commit();

			System.out.println("Order Placed Successfully!");

			System.out.println("Order ID : " + orderId);

			System.out.println("Total Amount : ₹" + totalAmount);

		} catch (ProductNotFoundException | InsufficientStockException e) {

			// Business failure → rollback
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException rollbackException) {
					rollbackException.printStackTrace();
				}
			}

			throw e;

		} catch (SQLException e) {

			// Database failure → rollback
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException rollbackException) {
					rollbackException.printStackTrace();
				}
			}

			throw new DatabaseOperationException("Order transaction failed: " + e.getMessage());

		} finally {

			// 10. Close connection
			if (connection != null) {

				try {
					connection.setAutoCommit(true);
					connection.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Get History of Product

	public List<Orders> getCustomerOrderHistory(int customerId) throws SQLException {

		// 1. Validate Customer ID
		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		// 2. Get customer's orders
		List<Orders> orders = orderRepository.getOrdersByCustomerId(customerId);

		// 3. Check whether orders exist
		if (orders.isEmpty()) {
			throw new OrderNotFoundException("No orders found for Customer ID: " + customerId);
		}

		return orders;
	}

	// Get OrderDetails by OrderId
	public List<OrderItem> getOrderDetails(int orderId) throws SQLException {
		if (orderId <= 0) {
			throw new InvalidOrderIdException("Order ID must be greater than 0");
		}

		List<OrderItem> items = orderRepository.getOrderItemsByOrderId(orderId);
		if (items.isEmpty()) {
			throw new OrderNotFoundException("No items found for Order ID: " + orderId);
		}
		return items;

	}

	// Cancel Order
	public void cancelOrder(int customerId, int orderId) throws SQLException {

		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		if (orderId <= 0) {
			throw new InvalidOrderIdException("Invalid Order ID");
		}

		Connection connection = null;

		try {
			connection = DBConnection.getConnection();
			connection.setAutoCommit(false);

			// 1. Get order details
			List<Orders> orders = orderRepository.getOrdersByCustomerId(customerId);

			Orders order = orders.stream().filter(o -> o.getOrderId() == orderId).findFirst()
					.orElseThrow(() -> new OrderNotFoundException("Order not found with ID: " + orderId));

			// 2. Check order status
			if (order.getOrderStatus() == OrderStatus.CANCELLED) {
				throw new InvalidOrderException("Order is already cancelled");
			}

			// 3. Get order items
			List<OrderItem> items = orderRepository.getOrderItemsByOrderId(orderId);

			// 4. Restore product stock
			for (OrderItem item : items) {

				Product product = productRepository.getProductById(item.getProductId());

				int restoredStock = product.getStockQuantity() + item.getQuantity();

				boolean updated = productRepository.updateProductStock(item.getProductId(), restoredStock, connection);

				if (!updated) {
					throw new DatabaseOperationException(
							"Failed to restore stock for Product ID: " + item.getProductId());
				}
			}

			// 5. Update order status
			boolean statusUpdated = orderRepository.updateOrderStatus(orderId, OrderStatus.CANCELLED, connection);

			if (!statusUpdated) {
				throw new DatabaseOperationException("Failed to cancel order");
			}

			// 6. Commit
			connection.commit();

			System.out.println("Order Cancelled Successfully!");
			System.out.println("Order ID : " + orderId);

		} catch (OrderNotFoundException | InvalidOrderException | DatabaseOperationException e) {

			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException rollbackException) {
					rollbackException.printStackTrace();
				}
			}

			throw e;

		} catch (SQLException e) {

			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException rollbackException) {
					rollbackException.printStackTrace();
				}
			}

			throw new DatabaseOperationException("Order cancellation failed: " + e.getMessage());

		} finally {

			if (connection != null) {
				try {
					connection.setAutoCommit(true);
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Process Payment
	public void processPayment(int customerId, int orderId) throws SQLException {

		// 1. Validate Customer ID
		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		// 2. Validate Order ID
		if (orderId <= 0) {
			throw new InvalidOrderIdException("Invalid Order ID");
		}

		// 3. Get Order
		Orders order = orderRepository.getOrderByOrderId(orderId);

		if (order == null) {
			throw new InvalidOrderIdException("Order not found with ID: " + orderId);
		}

		// 4. Verify customer owns this order
		if (order.getCustomerId() != customerId) {
			throw new InvalidOrderException("Order does not belong to this customer");
		}

		// 5. Check whether order is cancelled
		if (order.getOrderStatus() == OrderStatus.CANCELLED) {
			throw new InvalidOrderException("Payment cannot be processed for a cancelled order");
		}

		// 6. Check whether payment is already completed
		if (order.getPaymentStatus() == PaymentStatus.PAID) {
			throw new InvalidOrderException("Payment is already completed for this order");
		}

		Connection connection = null;

		try {

			// 7. Start transaction
			connection = DBConnection.getConnection();
			connection.setAutoCommit(false);

			// 8. Update payment status
			boolean updated = orderRepository.updatePaymentStatus(orderId, PaymentStatus.PAID.name(), connection);

			if (!updated) {
				throw new DatabaseOperationException("Failed to update payment status");
			}

			// 9. Commit transaction
			connection.commit();

			System.out.println("==================================");
			System.out.println("Payment Successful!");
			System.out.println("Order ID       : " + orderId);
			System.out.println("Amount Paid    : ₹" + order.getTotalAmount());
			System.out.println("Payment Status : " + PaymentStatus.PAID);
			System.out.println("==================================");

		} catch (SQLException e) {

			// Database failure → rollback
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException rollbackException) {
					rollbackException.printStackTrace();
				}
			}

			throw new DatabaseOperationException("Payment transaction failed: " + e.getMessage());

		} finally {

			// Close connection
			if (connection != null) {
				try {
					connection.setAutoCommit(true);
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Payment Failed Logic
	public void failPayment(int customerId, int orderId) throws SQLException {

		// 1. Validate Customer ID
		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		// 2. Validate Order ID
		if (orderId <= 0) {
			throw new InvalidOrderIdException("Invalid Order ID");
		}

		// 3. Get Order
		Orders order = orderRepository.getOrderByOrderId(orderId);

		if (order == null) {
			throw new InvalidOrderIdException("Order not found with ID: " + orderId);
		}

		// 4. Verify customer owns this order
		if (order.getCustomerId() != customerId) {
			throw new InvalidOrderException("Order does not belong to this customer");
		}

		// 5. Check order status
		if (order.getOrderStatus() == OrderStatus.CANCELLED) {
			throw new InvalidOrderException("Payment cannot be failed for a cancelled order");
		}

		// 6. Payment must currently be PENDING
		if (order.getPaymentStatus() != PaymentStatus.PENDING) {
			throw new InvalidOrderException("Payment is not in PENDING state");
		}

		Connection connection = null;

		try {

			// 7. Start transaction
			connection = DBConnection.getConnection();
			connection.setAutoCommit(false);

			// 8. Update Payment Status to FAILED
			boolean updated = orderRepository.updatePaymentStatus(orderId, PaymentStatus.FAILED.name(), connection);

			if (!updated) {
				throw new DatabaseOperationException("Failed to Update Payment Status");
			}

			// 9. Commit
			connection.commit();

			System.out.println("==================================");
			System.out.println("Payment Failed!");
			System.out.println("Order ID       : " + orderId);
			System.out.println("Payment Status : " + PaymentStatus.FAILED);
			System.out.println("==================================");

		} catch (SQLException e) {

			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException rollbackException) {
					rollbackException.printStackTrace();
				}
			}

			throw new DatabaseOperationException("Payment Transaction Failed : " + e.getMessage());

		} finally {

			if (connection != null) {
				try {
					connection.setAutoCommit(true);
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Payment Refund
	public void refundPayment(int customerId, int orderId) throws SQLException {
		// 1. Validate Customer ID
		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		// 2. Validate Order ID
		if (orderId <= 0) {
			throw new InvalidOrderIdException("Invalid Order ID");
		}

		// Get Order
		Orders order = orderRepository.getOrderByOrderId(orderId);

		if (order == null) {
			throw new InvalidOrderIdException("Order not found with ID: " + orderId);
		}

		// 4. Verify customer owns this order
		if (order.getCustomerId() != customerId) {
			throw new InvalidOrderException("Order does not belong to this customer");
		}

		// 5. Order must not be cancelled
		if (order.getOrderStatus() == OrderStatus.CANCELLED) {
			throw new InvalidOrderException("Cancelled order cannot be refunded");
		}

		// 6. Payment must be PAID
		if (order.getPaymentStatus() != PaymentStatus.PAID) {
			throw new InvalidOrderException("Only PAID orders can be refunded");
		}

		// Start Transaction
		Connection connection = null;
		try {
			connection = DBConnection.getConnection();
			connection.setAutoCommit(false);

			// Update payment Status to Refunded
			boolean updated = orderRepository.updatePaymentStatus(orderId, PaymentStatus.REFUNDED.name(), connection);

			if (!updated) {
				throw new DatabaseOperationException("Failed to update refund status");
			}

			// 9. Commit Transaction
			connection.commit();

			System.out.println("==================================");
			System.out.println("Refund Successful!");
			System.out.println("Order ID       : " + orderId);
			System.out.println("Refund Amount  : ₹" + order.getTotalAmount());
			System.out.println("Payment Status : " + PaymentStatus.REFUNDED);
			System.out.println("==================================");

		} catch (SQLException e) {

			// Rollback if database operation fails
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException rollbackException) {
					rollbackException.printStackTrace();
				}
			}

			throw new DatabaseOperationException("Refund transaction failed : " + e.getMessage());

		} finally {

			// Close Connection
			if (connection != null) {
				try {
					connection.setAutoCommit(true);
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void updateOrderStatus(int customerId, int orderId, OrderStatus newStatus) throws SQLException {

		// 1. Validate Customer ID
		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		// 2. Validate Order ID
		if (orderId <= 0) {
			throw new InvalidOrderIdException("Invalid Order ID");
		}

		// 3. Validate new status
		if (newStatus == null) {
			throw new InvalidOrderException("Order status cannot be null");
		}

		// 4. Get order
		Orders order = orderRepository.getOrderByOrderId(orderId);

		if (order == null) {
			throw new OrderNotFoundException("Order not found with ID: " + orderId);
		}

		// 5. Verify customer owns this order
		if (order.getCustomerId() != customerId) {
			throw new InvalidOrderException("Order does not belong to this customer");
		}

		// 6. Get current status
		OrderStatus currentStatus = order.getOrderStatus();

		// 7. Validate status transition

		if (currentStatus == OrderStatus.CONFIRMED && newStatus != OrderStatus.PROCESSING
				&& newStatus != OrderStatus.CANCELLED) {

			throw new InvalidOrderException("CONFIRMED order can only move to PROCESSING or CANCELLED");
		}

		if (currentStatus == OrderStatus.PROCESSING && newStatus != OrderStatus.SHIPPED
				&& newStatus != OrderStatus.CANCELLED) {

			throw new InvalidOrderException("PROCESSING order can only move to SHIPPED or CANCELLED");
		}

		if (currentStatus == OrderStatus.SHIPPED && newStatus != OrderStatus.DELIVERED) {

			throw new InvalidOrderException("SHIPPED order can only move to DELIVERED");
		}

		if (currentStatus == OrderStatus.DELIVERED) {
			throw new InvalidOrderException("DELIVERED order cannot change status");
		}

		if (currentStatus == OrderStatus.CANCELLED) {
			throw new InvalidOrderException("CANCELLED order cannot change status");
		}

		// 8. Start transaction
		Connection connection = null;

		try {

			connection = DBConnection.getConnection();
			connection.setAutoCommit(false);

			// 9. Update status
			boolean updated = orderRepository.updateOrderStatus(orderId, newStatus, connection);

			if (!updated) {
				throw new DatabaseOperationException("Failed to update order status");
			}

			// 10. Commit
			connection.commit();

			System.out.println("==================================");
			System.out.println("Order Status Updated Successfully!");
			System.out.println("Order ID       : " + orderId);
			System.out.println("Previous Status: " + currentStatus);
			System.out.println("New Status     : " + newStatus);
			System.out.println("==================================");

		} catch (SQLException e) {

			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException rollbackException) {
					rollbackException.printStackTrace();
				}
			}

			throw new DatabaseOperationException("Order status update failed: " + e.getMessage());

		} finally {

			if (connection != null) {
				try {
					connection.setAutoCommit(true);
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Get Order Details
	public Orders getOrderDetails(int customerId, int orderId) throws SQLException {

		// 1. Validate Customer ID
		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		// 2. Validate Order ID
		if (orderId <= 0) {
			throw new InvalidOrderIdException("Invalid Order ID");
		}

		// 3. Get customer's orders
		List<Orders> orders = orderRepository.getOrdersByCustomerId(customerId);

		// 4. Find the requested order
		Orders order = orders.stream().filter(o -> o.getOrderId() == orderId).findFirst()
				.orElseThrow(() -> new OrderNotFoundException("Order not found with ID: " + orderId));

		// 5. Get order items
		List<OrderItem> items = orderRepository.getOrderItemsByOrderId(orderId);

		// 6. Display order details
		System.out.println("==================================");
		System.out.println("          ORDER DETAILS");
		System.out.println("==================================");

		System.out.println("Order ID       : " + order.getOrderId());
		System.out.println("Customer ID    : " + order.getCustomerId());
		System.out.println("Order Date     : " + order.getOrderDate());
		System.out.println("Total Amount   : " + order.getTotalAmount());
		System.out.println("Order Status   : " + order.getOrderStatus());
		System.out.println("Payment Status : " + order.getPaymentStatus());

		System.out.println("----------------------------------");
		System.out.println("Order Items");

		for (OrderItem item : items) {
			System.out.println(item);
		}

		System.out.println("==================================");

		return order;
	}
}