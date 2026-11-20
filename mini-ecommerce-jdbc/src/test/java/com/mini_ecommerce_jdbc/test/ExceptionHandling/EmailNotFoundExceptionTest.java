package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.EmailNotFoundException;
import com.mini_ecommerce_jdbc.service.CustomerService;

public class EmailNotFoundExceptionTest {
	CustomerService customerService = new CustomerService();

	@Test
	void shouldThrowEmailNotFoundWhenEmailIsNull() throws SQLException {

		assertThrows(EmailNotFoundException.class, () -> customerService.loginCustomer(null, "password123"));
	}

	@Test
	void shouldThrowEmailNotFoundWhenEmailIsBlank() throws SQLException {

		assertThrows(EmailNotFoundException.class, () -> customerService.loginCustomer("   ", "password123"));
	}
}
