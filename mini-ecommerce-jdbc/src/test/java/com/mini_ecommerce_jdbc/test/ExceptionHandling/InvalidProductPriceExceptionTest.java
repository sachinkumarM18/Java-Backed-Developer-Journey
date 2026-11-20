package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.InvalidProductIdException;
import com.mini_ecommerce_jdbc.exception.InvalidProductPriceException;
import com.mini_ecommerce_jdbc.model.Product;
import com.mini_ecommerce_jdbc.service.ProductService;

public class InvalidProductPriceExceptionTest {
	ProductService productService = new ProductService();

	@Test
	void shouldThrowInvalidProductPriceWhenPriceIsZero() throws SQLException {

		Product product = new Product(501, "Laptop", "Electronics", 0, 10, "Dell");

		assertThrows(InvalidProductPriceException.class, () -> productService.addProduct(product));
	}

	@Test
	void shouldThrowIllegalArgumentExceptionWhenStockQuantityIsNegative() throws SQLException {

		Product product = new Product(501, "Laptop", "Electronics", 50000, -1, "Dell");

		assertThrows(IllegalArgumentException.class, () -> productService.addProduct(product));
	}

	@Test
	void shouldThrowInvalidProductPriceWhenPriceIsNegative() throws SQLException {

		assertThrows(InvalidProductPriceException.class, () -> productService.getProductByPriceRange(-100, 50000));
	}

	@Test
	void shouldThrowInvalidProductPriceWhenMinPriceIsGreaterThanMaxPrice() throws SQLException {

		assertThrows(InvalidProductPriceException.class, () -> productService.getProductByPriceRange(50000, 10000));
	}

	@Test
	void shouldThrowInvalidProductPriceWhenUpdatingProductWithInvalidPrice() throws SQLException {

		assertThrows(InvalidProductPriceException.class, () -> productService.updateProductPrice(101, 0));
	}

	@Test
	void shouldThrowInvalidProductIdWhenDeletingProductWithInvalidId() throws SQLException {

		assertThrows(InvalidProductIdException.class, () -> productService.deleteProductById(0));
	}
}
