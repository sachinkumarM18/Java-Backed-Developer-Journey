package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.PasswordNotFoundException;
import com.mini_ecommerce_jdbc.exception.ProductNotFoundException;
import com.mini_ecommerce_jdbc.service.CustomerService;
import com.mini_ecommerce_jdbc.service.ProductService;

public class PasswordNotFoundExceptionTest {
	CustomerService customerService = new CustomerService();
	ProductService productService = new ProductService();

	@Test
	void shouldThrowPasswordNotFoundWhenPasswordIsNull() throws SQLException {

		assertThrows(PasswordNotFoundException.class, () -> customerService.loginCustomer("sachin@gmail.com", null));
	}

	@Test
	void shouldThrowPasswordNotFoundWhenPasswordIsBlank() throws SQLException {

		assertThrows(PasswordNotFoundException.class, () -> customerService.loginCustomer("sachin@gmail.com", "   "));
	}

	@Test
	void shouldThrowProductNotFoundWhenProductDoesNotExist() throws SQLException {

		assertThrows(ProductNotFoundException.class, () -> productService.getProductById(999999));
	}
	
	@Test
	void shouldThrowProductNotFoundWhenProductNameIsBlank() throws SQLException {

	    assertThrows(
	            ProductNotFoundException.class,
	            () -> productService.getProductByName("   ")
	    );
	}
	
	@Test
	void shouldThrowProductNotFoundWhenProductNameDoesNotExist() throws SQLException {

	    assertThrows(
	            ProductNotFoundException.class,
	            () -> productService.getProductByName("UnknownProductXYZ")
	    );
	}
}
