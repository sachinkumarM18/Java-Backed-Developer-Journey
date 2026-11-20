package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.InvalidPasswordException;
import com.mini_ecommerce_jdbc.model.Customer;
import com.mini_ecommerce_jdbc.service.CustomerService;

public class InvalidPasswordExceptionTest {

	CustomerService customerService = new CustomerService();

	@Test
	void shouldThrowInvalidPasswordWhenPasswordIsBlank() throws SQLException {

		Customer customer = new Customer(999995, "Sachin", "sachin3@gmail.com", "9876543210", "Chennai", "   ");

		assertThrows(InvalidPasswordException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowInvalidPasswordWhenPasswordIsTooShort() throws SQLException {

		Customer customer = new Customer(999994, "Sachin", "sachin4@gmail.com", "9876543210", "Chennai", "pass123");

		assertThrows(InvalidPasswordException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowInvalidPasswordWhenLoginPasswordIsIncorrect() throws SQLException {

		assertThrows(InvalidPasswordException.class,
				() -> customerService.loginCustomer("sachin@gmail.com", "wrongpassword"));
	}

	@Test
	void shouldThrowInvalidPasswordWhenUpdatingWithNullPassword() throws SQLException {

		Customer customer = new Customer(101, "Sachin", "sachin@gmail.com", "9876543210", "Chennai", null);

		assertThrows(InvalidPasswordException.class, () -> customerService.updateCustomer(customer));
	}

	@Test
	void shouldThrowInvalidPasswordWhenUpdatingWithBlankPassword() throws SQLException {

		Customer customer = new Customer(101, "Sachin", "sachin@gmail.com", "9876543210", "Chennai", "   ");

		assertThrows(InvalidPasswordException.class, () -> customerService.updateCustomer(customer));
	}

	@Test
	void shouldThrowInvalidPasswordWhenUpdatingWithShortPassword() throws SQLException {

		Customer customer = new Customer(101, "Sachin", "sachin@gmail.com", "9876543210", "Chennai", "pass123");

		assertThrows(InvalidPasswordException.class, () -> customerService.updateCustomer(customer));
	}
}
