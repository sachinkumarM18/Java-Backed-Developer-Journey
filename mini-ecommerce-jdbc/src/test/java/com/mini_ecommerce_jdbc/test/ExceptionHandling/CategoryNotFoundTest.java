package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.CategoryNotFoundException;
import com.mini_ecommerce_jdbc.service.ProductService;

public class CategoryNotFoundTest {

	ProductService productService = new ProductService();

	@Test
	public void shouldThrowCategoryNotFoundException() {

		assertThrows(CategoryNotFoundException.class, () -> productService.getProductByCategory("UnknownCategory"));
	}

	@Test
	void shouldThrowCategoryNotFoundWhenCategoryIsBlank() throws SQLException {

		assertThrows(CategoryNotFoundException.class, () -> productService.getProductByCategory("   "));
	}

	@Test
	void shouldThrowCategoryNotFoundWhenCategoryDoesNotExist() throws SQLException {

		assertThrows(CategoryNotFoundException.class, () -> productService.getProductByCategory("UnknownCategoryXYZ"));
	}
}