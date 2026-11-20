package com.mini_ecommerce_jdbc.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.model.OrderItem;

public class OrderItemTestModel {

	@Test
	public void shouldCreateOrderItem() {
		OrderItem orderItem = new OrderItem(1001, 101, 501, 2, 50000);
		assertEquals(1001, orderItem.getOrderItemId());
		assertEquals(101, orderItem.getOrderId());
		assertEquals(501, orderItem.getProductId());
		assertEquals(2, orderItem.getQuantity());
		assertEquals(50000, orderItem.getUnitPrice());
	}

	@Test
	public void shouldCreateOrderItemdata() {
		OrderItem item = new OrderItem(501, 2, 50000);
		assertEquals(501, item.getProductId());
		assertEquals(2, item.getQuantity());
		assertEquals(50000, item.getUnitPrice());
	}

	@Test
	public void updateOrderItem() {
		OrderItem item = new OrderItem(1001, 101, 501, 2, 50000);
		assertEquals(1001, item.getOrderItemId());
		assertEquals(101, item.getOrderId());
		assertEquals(501, item.getProductId());
		assertEquals(2, item.getQuantity());
		assertEquals(50000, item.getUnitPrice());
	}

	@Test
	public void shouldUpdateOrderValue() {
		OrderItem item = new OrderItem(1004, 103, 503, 7, 76000);
		item.setOrderItemId(1002);
		item.setOrderId(102);
		item.setProductId(502);
		item.setQuantity(5);
		item.setUnitPrice(75000);

		assertEquals(1002, item.getOrderItemId());
		assertEquals(102, item.getOrderId());
		assertEquals(502, item.getProductId());
		assertEquals(5, item.getQuantity());
		assertEquals(75000, item.getUnitPrice());
	}

	@Test
	public void shouldReturnStringValue() {
		OrderItem item = new OrderItem(1001, 101, 501, 2, 50000);
		String result = item.toString();

		assertEquals("OrderItem [orderItemId=1001, orderId=101, productId=501, quantity=2, unitPrice=50000]", result);
	}

}
