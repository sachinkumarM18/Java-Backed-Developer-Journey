package com.mini_ecommerce_jdbc.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.model.Cart;

public class CartTestModel {
	@Test
	public void shouldCreateCartWithCartId() {

		Cart cart = new Cart(101, 1, 501, 2);
		assertEquals(101, cart.getCartId());
		assertEquals(1, cart.getCustomerId());
		assertEquals(501, cart.getProductId());
		assertEquals(2, cart.getQuantity());  
	}

	@Test
	public void shouldCreateCartWithoutCartId() {  
		Cart cart = new Cart(1, 501, 3);
		assertEquals(1, cart.getCustomerId());
		assertEquals(501, cart.getProductId());
		assertEquals(3, cart.getQuantity());
	}

	@Test
	public void shouldReturnCartString() {
		Cart cart = new Cart(101, 1, 501, 2);
		String result = cart.toString();

		assertEquals("Cart [cartId=101, customerId=1, productId=501, quantity=2]", result);
	}
}
