package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.InvalidCustomerIdException;
import com.mini_ecommerce_jdbc.model.Customer;
import com.mini_ecommerce_jdbc.service.CartService;
import com.mini_ecommerce_jdbc.service.CustomerService;

public class InvalidCustomerIdExceptionTest {
	CustomerService customerService = new CustomerService();
	CartService cartService = new CartService();

	@Test
	void shouldThrowInvalidCustomerIdWhenRegisteringWithInvalidId() throws SQLException {

		Customer customer = new Customer(0, "Sachin", "sachin10@gmail.com", "9876543210", "Chennai", "password123");

		assertThrows(InvalidCustomerIdException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowInvalidCustomerIdWhenUpdatingWithInvalidId() throws SQLException {

		Customer customer = new Customer(0, "Sachin", "sachin10@gmail.com", "9876543210", "Chennai", "password123");

		assertThrows(InvalidCustomerIdException.class, () -> customerService.updateCustomer(customer));
	} 

	@Test
	void shouldThrowInvalidCustomerIdWhenDeletingWithInvalidId() throws SQLException {

		assertThrows(InvalidCustomerIdException.class, () -> customerService.deleteCustomer(0));
	}

	@Test
	void shouldThrowInvalidCustomerIdWhenAddingProductToCart() throws SQLException {

		assertThrows(InvalidCustomerIdException.class, () -> cartService.addProductToCart(0, 501, 1));
	}
}
