package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.service.ProductService;

public class InvalidBrandExceptionTest {

	ProductService productService = new ProductService();

	@Test
	void shouldThrowIllegalArgumentExceptionWhenBrandIsBlank() throws SQLException {

		assertThrows(IllegalArgumentException.class, () -> productService.getProductsByBrand("   "));
	}
}