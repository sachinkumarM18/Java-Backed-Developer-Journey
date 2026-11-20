package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.InvalidMobileNumberException;
import com.mini_ecommerce_jdbc.model.Customer;
import com.mini_ecommerce_jdbc.service.CustomerService;

public class InvalidMobileNumberExceptionTest {

	CustomerService customerService = new CustomerService();

	@Test
	void shouldThrowInvalidMobileWhenMobileIsNull() throws SQLException {

		Customer customer = new Customer(999997, "Sachin", "sachin@gmail.com", null, "Chennai", "password123");

		assertThrows(InvalidMobileNumberException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowInvalidMobileWhenMobileFormatIsInvalid() throws SQLException {

		Customer customer = new Customer(999996, "Sachin", "sachin2@gmail.com", "12345", "Chennai", "password123");

		assertThrows(InvalidMobileNumberException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowInvalidMobileWhenUpdatingWithNullMobile() throws SQLException {

		Customer customer = new Customer(101, "Sachin", "sachin@gmail.com", null, "Chennai", "password123");

		assertThrows(InvalidMobileNumberException.class, () -> customerService.updateCustomer(customer));
	}

	@Test
	void shouldThrowInvalidMobileWhenUpdatingWithInvalidMobile() throws SQLException {

		Customer customer = new Customer(101, "Sachin", "sachin@gmail.com", "12345", "Chennai", "password123");

		assertThrows(InvalidMobileNumberException.class, () -> customerService.updateCustomer(customer));
	}
}
