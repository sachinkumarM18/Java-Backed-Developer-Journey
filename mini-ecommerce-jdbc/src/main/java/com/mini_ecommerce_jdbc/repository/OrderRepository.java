package com.mini_ecommerce_jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mini_ecommerce_jdbc.config.DBConnection;
import com.mini_ecommerce_jdbc.exception.DatabaseOperationException;
import com.mini_ecommerce_jdbc.model.OrderItem;
import com.mini_ecommerce_jdbc.model.OrderStatus;
import com.mini_ecommerce_jdbc.model.Orders;
import com.mini_ecommerce_jdbc.model.PaymentStatus;

public class OrderRepository {

	// 1. Insert parent Order and generator keyId
	public int createOrder(Orders orders, Connection connection) throws SQLException {
		String query = "insert into orders " + "(customerId , orderDate, totalAmount , orderStatus , paymentStatus) "
				+ " values (? , now(), ? , ? , ?)";

		try (PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
			ps.setInt(1, orders.getCustomerId());
			ps.setInt(2, orders.getTotalAmount());
			ps.setString(3, orders.getOrderStatus().name()); 
			ps.setString(4, orders.getPaymentStatus().name());

			ps.executeUpdate();

			try (ResultSet rs = ps.getGeneratedKeys()) {
				if (rs.next()) {
					return rs.getInt(1);
				} else {
					throw new DatabaseOperationException("Connection Failed!");
				}
			}
		}
	}

	// 2. Batch Processing Implemention to Execute Multiple Order
	public void saveOrderItemBatch(int orderId, List<OrderItem> items, Connection connection) throws SQLException {
		String query = "insert into order_items (orderId, productId, quantity, unitPrice) VALUES (?, ?, ?, ?)";
		try (PreparedStatement ps = connection.prepareStatement(query)) {
			for (OrderItem item : items) {
				ps.setInt(1, orderId);
				ps.setInt(2, item.getProductId());
				ps.setInt(3, item.getQuantity());
				ps.setDouble(4, item.getUnitPrice());

				ps.addBatch(); // Catch container
			}

			ps.executeBatch(); // Every item will hit in Database at a same time
		}
	}

	// 3. Clear Shoping cart
	public void clearCart(int customerId, Connection connection) throws SQLException {
		String query = "delete from cart where customerId = ?";

		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, customerId);
			ps.executeUpdate();
		}
	}

	// 4. Get Order History
	public List<Orders> getOrdersByCustomerId(int customerId) throws SQLException {

		String query = "SELECT * FROM orders WHERE customerId = ?";

		List<Orders> orders = new ArrayList<>();

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setInt(1, customerId);

			try (ResultSet rs = ps.executeQuery()) {

				while (rs.next()) {

					Orders order = new Orders(rs.getInt("orderId"), rs.getInt("customerId"),
							rs.getTimestamp("orderDate").toLocalDateTime(), rs.getInt("totalAmount"),
							OrderStatus.valueOf(rs.getString("orderStatus").toUpperCase()));

					order.setPaymentStatus(PaymentStatus.valueOf(rs.getString("paymentStatus")));

					orders.add(order); 
				}
			}
		}

		return orders;
	}

	// Get Order by Order ID
	public Orders getOrderByOrderId(int orderId) throws SQLException {

		String query = "SELECT * FROM orders WHERE orderId = ?";

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setInt(1, orderId);

			try (ResultSet rs = ps.executeQuery()) {

				if (rs.next()) {

					Orders order = new Orders(rs.getInt("orderId"), rs.getInt("customerId"),
							rs.getTimestamp("orderDate").toLocalDateTime(), rs.getInt("totalAmount"),
							OrderStatus.valueOf(rs.getString("orderStatus")));

					order.setPaymentStatus(PaymentStatus.valueOf(rs.getString("paymentStatus")));

					return order;
				}
			}
		}

		return null;
	}

	// Get OrderItem by OrderId
	public List<OrderItem> getOrderItemsByOrderId(int orderId) throws SQLException {
		String query = "select * from order_items where orderId = ?";
		List<OrderItem> items = new ArrayList<>();

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, orderId);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {

					OrderItem item = new OrderItem(rs.getInt("orderItemId"), rs.getInt("orderId"),
							rs.getInt("productId"), rs.getInt("quantity"), rs.getInt("unitPrice"));

					items.add(item);
				}
			}
		}
		return items;
	}

	// Update Order Status
	public boolean updateOrderStatus(int orderId, OrderStatus status, Connection connection) throws SQLException {

		String query = "UPDATE orders SET orderStatus = ? WHERE orderId = ?";

		try (PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, status.name());
			ps.setInt(2, orderId);
 
			return ps.executeUpdate() > 0; 
		}
	}

	// Update Payment Status
	public boolean updatePaymentStatus(int orderId, String paymentStatus, Connection connection) throws SQLException {
		String query = "UPDATE orders SET paymentStatus = ? WHERE orderId = ?";
		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, paymentStatus);
			ps.setInt(2, orderId);

			return ps.executeUpdate() > 0;
		}
	}
	
	
}
