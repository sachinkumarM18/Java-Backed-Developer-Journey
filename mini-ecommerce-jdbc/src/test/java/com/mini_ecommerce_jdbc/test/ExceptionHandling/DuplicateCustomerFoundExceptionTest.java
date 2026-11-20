package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.DuplicateCustomerFoundException;
import com.mini_ecommerce_jdbc.model.Customer;
import com.mini_ecommerce_jdbc.repository.CustomerRepository;
import com.mini_ecommerce_jdbc.service.CustomerService;

public class DuplicateCustomerFoundExceptionTest {
	CustomerService customerService = new CustomerService();

	@Test
	void shouldThrowDuplicateCustomerWhenCustomerIdAlreadyExists() throws SQLException {

		Customer customer = new Customer(101, "Sachin", "newemail@gmail.com", "9876543210", "Chennai", "password123");

		assertThrows(DuplicateCustomerFoundException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowDuplicateCustomerWhenEmailAlreadyExists() throws SQLException {

		Customer customer = new Customer(999993, "Sachin", "sachin@gmail.com", "9876543210", "Chennai", "password123");

		assertThrows(DuplicateCustomerFoundException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowDuplicateCustomerWhenUpdatingWithAnotherCustomersEmail() throws SQLException {

		CustomerRepository customerRepository = mock(CustomerRepository.class);

		CustomerService customerService = new CustomerService(customerRepository);

		Customer existingCustomer = new Customer(101, "Sachin", "sachin@gmail.com", "9876543210", "Chennai",
				"password123");

		Customer customerToUpdate = new Customer(101, "Sachin", "anothercustomer@gmail.com", "9876543210", "Chennai",
				"password123");

		Customer anotherCustomer = new Customer(102, "Rahul", "anothercustomer@gmail.com", "9876543211", "Chennai",
				"password123");

		when(customerRepository.getCustomerById(101)).thenReturn(existingCustomer);

		when(customerRepository.getCustomerByEmail("anothercustomer@gmail.com")).thenReturn(anotherCustomer);

		assertThrows(DuplicateCustomerFoundException.class, () -> customerService.updateCustomer(customerToUpdate));
	}
}
