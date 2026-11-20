package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.InvalidEmailException;
import com.mini_ecommerce_jdbc.model.Customer;
import com.mini_ecommerce_jdbc.service.CustomerService;

public class InvalidEmailIdExceptionTest {

	CustomerService customerService = new CustomerService();

	@Test
	void shouldThrowInvalidEmailWhenEmailIsNull() throws SQLException {

		Customer customer = new Customer(191, "Sachin", null, "9876543210", "Chennai", "password123");

		assertThrows(InvalidEmailException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowInvalidEmailWhenEmailFormatIsInvalid() throws SQLException {

		Customer customer = new Customer(183, "Sachin", "invalid-email", "9876543210", "Chennai", "password123");

		assertThrows(InvalidEmailException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowInvalidEmailWhenUpdatingWithNullEmail() throws SQLException {

		Customer customer = new Customer(101, "Sachin", null, "9876543210", "Chennai", "password123");

		assertThrows(InvalidEmailException.class, () -> customerService.updateCustomer(customer));
	}

	@Test
	void shouldThrowInvalidEmailWhenUpdatingWithInvalidEmail() throws SQLException {

		Customer customer = new Customer(101, "Sachin", "invalid-email", "9876543210", "Chennai", "password123");

		assertThrows(InvalidEmailException.class, () -> customerService.updateCustomer(customer));
	}
}
