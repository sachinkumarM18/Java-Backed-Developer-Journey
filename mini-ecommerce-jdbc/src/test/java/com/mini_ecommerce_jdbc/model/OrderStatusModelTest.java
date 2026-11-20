
package com.mini_ecommerce_jdbc.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.model.OrderStatus;

public class OrderStatusModelTest {

	@Test
	void shouldContainAllOrderStatuses() {

		OrderStatus[] statuses = OrderStatus.values();

		assertEquals(5, statuses.length); 

		assertNotNull(OrderStatus.CONFIRMED); 
		assertNotNull(OrderStatus.PROCESSING);
		assertNotNull(OrderStatus.SHIPPED);
		assertNotNull(OrderStatus.DELIVERED);
		assertNotNull(OrderStatus.CANCELLED);
	}

	@Test
	void shouldReturnCorrectOrderStatus() {

		assertEquals(OrderStatus.CONFIRMED, OrderStatus.valueOf("CONFIRMED"));
		assertEquals(OrderStatus.PROCESSING, OrderStatus.valueOf("PROCESSING"));
		assertEquals(OrderStatus.SHIPPED, OrderStatus.valueOf("SHIPPED"));
		assertEquals(OrderStatus.DELIVERED, OrderStatus.valueOf("DELIVERED"));
		assertEquals(OrderStatus.CANCELLED, OrderStatus.valueOf("CANCELLED"));
	}
}