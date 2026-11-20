package com.mini_ecommerce_jdbc.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.model.Customer;

public class CustomerTestModel {

	@Test
	public void shouldCreateCustomer() {
		Customer customer = new Customer(101, "Sachin", "sachin@gmail.com", "9876543210", "Chennai", "password123");
		assertEquals(101, customer.getCustomerId());
		assertEquals("Sachin", customer.getCustomerName());
		assertEquals("sachin@gmail.com", customer.getEmail());
		assertEquals("9876543210", customer.getMobile());
		assertEquals("Chennai", customer.getAddress());
		assertEquals("password123", customer.getPassword());
	} 

	@Test 
	public void shouldUpdate() {
		Customer customer = new Customer(101, "Sachin", "sachin@gmail.com", "9876543210", "Chennai", "password123");
		customer.setCustomerId(102);
		customer.setCustomerName("Rohit");
		customer.setEmail("rohit@gmail.com");
		customer.setMobile("8229842913");
		customer.setAddress("BLR");
		customer.setPassword("rohit@123"); 

		assertEquals(102, customer.getCustomerId());
		assertEquals("Rohit", customer.getCustomerName());
		assertEquals("rohit@gmail.com", customer.getEmail());
		assertEquals("8229842913", customer.getMobile());
		assertEquals("BLR", customer.getAddress());
		assertEquals("rohit@123", customer.getPassword());

	}

	@Test
	public void shouldReturnString() {
		Customer customer = new Customer(101, "Sachin", "sachin@gmail.com", "9876543210", "Chennai", "password123");

		String result = customer.toString();

		assertEquals(
				"Customer [customerId=101, customerName=Sachin, email=sachin@gmail.com, mobile=9876543210, address=Chennai]",
				result);

//		assertEquals(
//				"Customer [customerId=101, customerName=Sachin, email=sachin@gmail.com, mobile=9876543210, address=Chennai]",
//				result);
	}
}
