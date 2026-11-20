package com.mini_ecommerce_jdbc.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.model.OrderStatus;
import com.mini_ecommerce_jdbc.model.Orders;
import com.mini_ecommerce_jdbc.model.PaymentStatus;

public class OrderTestModel {

	@Test
	public void shouldOrderWithBasicDetails() {

		Orders order = new Orders(101, 50000, OrderStatus.DELIVERED, PaymentStatus.PAID);

		assertEquals(0, order.getOrderId());
		assertEquals(101, order.getCustomerId());
		assertEquals(50000, order.getTotalAmount());
		assertEquals(OrderStatus.DELIVERED, order.getOrderStatus());
		assertEquals(PaymentStatus.PAID, order.getPaymentStatus());
	}

	@Test
	public void shouldPlaceOrderWithDetails() {

		LocalDateTime orderDate = LocalDateTime.of(2026, 10, 27, 10, 30);

		Orders order = new Orders(1001, 101, orderDate, 50000, OrderStatus.PROCESSING);

		assertEquals(1001, order.getOrderId());
		assertEquals(101, order.getCustomerId());
		assertEquals(orderDate, order.getOrderDate());
		assertEquals(50000, order.getTotalAmount());
		assertEquals(OrderStatus.PROCESSING, order.getOrderStatus());
		assertNull(order.getPaymentStatus());
	}

	@Test
	void shouldUpdateOrderStatusAndPaymentStatus() { 

		Orders order = new Orders(101, 50000, OrderStatus.DELIVERED, PaymentStatus.PENDING);

		order.setOrderStatus(OrderStatus.SHIPPED);
		order.setPaymentStatus(PaymentStatus.PAID);

		assertEquals(OrderStatus.SHIPPED, order.getOrderStatus());
		assertEquals(PaymentStatus.PAID, order.getPaymentStatus());
	}

	@Test
	void shouldReturnOrderString() {

		LocalDateTime orderDate = LocalDateTime.of(2026, 10, 27, 10, 30);

		Orders order = new Orders(1001, 101, orderDate, 50000, OrderStatus.PROCESSING);

		String result = order.toString();

		assertEquals(
				"Orders [orderId=1001, customerId=101, orderDate=2026-10-27T10:30, totalAmount=50000, orderStatus=PROCESSING]",
				result);
	}
}