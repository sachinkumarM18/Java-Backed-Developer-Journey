package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.CustomerNotFoundException;
import com.mini_ecommerce_jdbc.model.Customer;
import com.mini_ecommerce_jdbc.service.CustomerService;
import com.mini_ecommerce_jdbc.service.ProductService;

public class CustomerNotFoundExceptionTest {
	CustomerService customerService = new CustomerService();
	ProductService productService = new ProductService();

	@Test
	void shouldThrowCustomerNotFoundWhenCustomerIsNull() {

		CustomerNotFoundException exception = assertThrows(CustomerNotFoundException.class,
				() -> customerService.registerCustomer(null));

		assertEquals("Customer Data Can't be Null", exception.getMessage());
	}

	@Test
	public void shouldCustomerNotFoundWhenCustomerNameIsNull() {

		Customer customer = new Customer(101, null, "sachin@gmail.com", "9876543210", "Chennai", "password123");
		assertThrows(CustomerNotFoundException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowCustomerNotFoundWhenCustomerNameIsBlank() {

		Customer customer = new Customer(101, "   ", "sachin@gmail.com", "9876543210", "Chennai", "password123");

		assertThrows(CustomerNotFoundException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowCustomerNotFoundWhenCustomerDoesNotExist() throws SQLException {

		assertThrows(CustomerNotFoundException.class, () -> customerService.getCustomerById(999999));
	}

	@Test
	void shouldThrowCustomerNotFoundWhenLoginEmailDoesNotExist() {

		assertThrows(CustomerNotFoundException.class,
				() -> customerService.loginCustomer("unknown@gmail.com", "password123"));
	}

	@Test
	void shouldThrowCustomerNotFoundWhenUpdatingUnknownCustomer() throws SQLException {

		Customer customer = new Customer(999999, "Sachin", "sachin@gmail.com", "9876543210", "Chennai", "password123");

		assertThrows(CustomerNotFoundException.class, () -> customerService.updateCustomer(customer));
	}

	@Test
	void shouldThrowCustomerNotFoundWhenDeletingUnknownCustomer() throws SQLException {

		assertThrows(CustomerNotFoundException.class, () -> customerService.deleteCustomer(999999));
	}
}
