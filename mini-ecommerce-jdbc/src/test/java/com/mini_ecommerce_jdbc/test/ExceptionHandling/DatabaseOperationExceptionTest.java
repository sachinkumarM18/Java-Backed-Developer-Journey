package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.DatabaseOperationException;
import com.mini_ecommerce_jdbc.model.Cart;
import com.mini_ecommerce_jdbc.model.Customer;
import com.mini_ecommerce_jdbc.model.Product;
import com.mini_ecommerce_jdbc.repository.CartRepository;
import com.mini_ecommerce_jdbc.repository.CustomerRepository;
import com.mini_ecommerce_jdbc.repository.ProductRepository;
import com.mini_ecommerce_jdbc.service.CartService;
import com.mini_ecommerce_jdbc.service.CustomerService;

public class DatabaseOperationExceptionTest {

	@Test
	void shouldThrowDatabaseOperationExceptionWhenCustomerRegistrationFails() throws SQLException {

		CustomerRepository customerRepository = mock(CustomerRepository.class);

		CustomerService customerService = new CustomerService(customerRepository);

		Customer customer = new Customer(999991, "Sachin", "newcustomer@gmail.com", "9876543210", "Chennai",
				"password123");

		when(customerRepository.existsById(customer.getCustomerId())).thenReturn(false);

		when(customerRepository.getCustomerByEmail(customer.getEmail().trim())).thenReturn(null);

		when(customerRepository.addCustomer(customer)).thenReturn(false);

		assertThrows(DatabaseOperationException.class, () -> customerService.registerCustomer(customer));
	}

	@Test
	void shouldThrowDatabaseOperationExceptionWhenCustomerUpdateFails() throws SQLException {

		CustomerRepository customerRepository = mock(CustomerRepository.class);

		CustomerService customerService = new CustomerService(customerRepository);

		Customer customer = new Customer(101, "Sachin", "sachin@gmail.com", "9876543210", "Chennai", "password123");

		when(customerRepository.getCustomerById(customer.getCustomerId())).thenReturn(customer);

		when(customerRepository.getCustomerByEmail(customer.getEmail().trim())).thenReturn(null);

		when(customerRepository.updateCustomer(customer)).thenReturn(false);

		assertThrows(DatabaseOperationException.class, () -> customerService.updateCustomer(customer));
	}

	@Test
	void shouldThrowDatabaseOperationExceptionWhenCartQuantityUpdateFails() throws SQLException {

		CartRepository cartRepository = mock(CartRepository.class);
		ProductRepository productRepository = mock(ProductRepository.class);

		CartService cartService = new CartService(cartRepository, productRepository);

		Product product = new Product(501, "Laptop", "Electronics", 50000, 10, "Dell");

		Cart cart = new Cart(101, 501, 2); 

		when(productRepository.getProductById(501)).thenReturn(product);
		when(cartRepository.getCartItem(101, 501)).thenReturn(cart);
		when(cartRepository.updateCartQuantity(101, 501, 5)).thenReturn(false);

		assertThrows(DatabaseOperationException.class, () -> cartService.updateCartQuantity(101, 501, 5));
	}
}