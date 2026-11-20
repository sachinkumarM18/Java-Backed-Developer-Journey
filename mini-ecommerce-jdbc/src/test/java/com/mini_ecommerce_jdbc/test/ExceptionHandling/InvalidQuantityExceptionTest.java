package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.InvalidQuantityException;
import com.mini_ecommerce_jdbc.service.CartService;
import com.mini_ecommerce_jdbc.service.CustomerService;

public class InvalidQuantityExceptionTest {
	CustomerService customerService = new CustomerService();
	CartService cartService = new CartService();

	@Test
	void shouldThrowInvalidQuantityWhenAddingProductToCart() throws SQLException {

		assertThrows(InvalidQuantityException.class, () -> cartService.addProductToCart(101, 501, 0));
	}

	@Test
	void shouldThrowInvalidQuantityWhenAddingNegativeQuantity() throws SQLException {

		assertThrows(InvalidQuantityException.class, () -> cartService.addProductToCart(101, 501, -1));
	}

	@Test
	void shouldThrowInvalidQuantityWhenUpdatingCartQuantity() throws SQLException {

		assertThrows(InvalidQuantityException.class, () -> cartService.updateCartQuantity(101, 501, 0));
	}

	@Test
	void shouldThrowInvalidQuantityWhenUpdatingNegativeQuantity() throws SQLException {

		assertThrows(InvalidQuantityException.class, () -> cartService.updateCartQuantity(101, 501, -1));
	}
}
