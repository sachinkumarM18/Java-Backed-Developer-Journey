package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.InvalidProductIdException;
import com.mini_ecommerce_jdbc.service.CartService;
import com.mini_ecommerce_jdbc.service.ProductService;

public class InvalidProductIdExceptionTest {
	CartService cartService = new CartService();
	ProductService productService = new ProductService();

	@Test
	void shouldThrowInvalidProductIdWhenAddingProductToCart() throws SQLException {

		assertThrows(InvalidProductIdException.class, () -> cartService.addProductToCart(101, 0, 1));
	}

	@Test
	void shouldThrowInvalidProductIdWhenDeletingProductFromCart() throws SQLException {

		assertThrows(InvalidProductIdException.class, () -> cartService.deleteProductFromCart(101, 0));
	}

	@Test
	void shouldThrowInvalidProductIdWhenUpdatingCartQuantity() throws SQLException {

		assertThrows(InvalidProductIdException.class, () -> cartService.updateCartQuantity(101, 0, 1));
	}

	@Test
	void shouldThrowInvalidProductIdWhenProductIdIsInvalid() throws SQLException {

		assertThrows(InvalidProductIdException.class, () -> productService.getProductById(0));
	}

	@Test
	void shouldThrowInvalidProductIdWhenUpdatingProductPriceWithInvalidId() throws SQLException {

		assertThrows(InvalidProductIdException.class, () -> productService.updateProductPrice(0, 50000));
	}
}
