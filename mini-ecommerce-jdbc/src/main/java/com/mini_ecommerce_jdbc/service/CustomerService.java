package com.mini_ecommerce_jdbc.service;

import java.sql.SQLException;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.mini_ecommerce_jdbc.exception.CustomerNotFoundException;
import com.mini_ecommerce_jdbc.exception.DatabaseOperationException;
import com.mini_ecommerce_jdbc.exception.DuplicateCustomerFoundException;
import com.mini_ecommerce_jdbc.exception.EmailNotFoundException;
import com.mini_ecommerce_jdbc.exception.InvalidCustomerIdException;
import com.mini_ecommerce_jdbc.exception.InvalidEmailException;
import com.mini_ecommerce_jdbc.exception.InvalidMobileNumberException;
import com.mini_ecommerce_jdbc.exception.InvalidPasswordException;
import com.mini_ecommerce_jdbc.exception.PasswordNotFoundException;
import com.mini_ecommerce_jdbc.model.Customer;
import com.mini_ecommerce_jdbc.repository.CustomerRepository;

public class CustomerService {

	private CustomerRepository customerRepository;

	public CustomerService() {
		this.customerRepository = new CustomerRepository();
	}

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	// 1. Customer Registration
	public void registerCustomer(Customer customer) throws SQLException {

		// 1. Validate Customer
		if (customer == null) {
			throw new CustomerNotFoundException("Customer Data Can't be Null");
		}

		// 2. Validate CustomerName
		if (customer.getCustomerName() == null || customer.getCustomerName().isBlank()) {
			throw new CustomerNotFoundException("Cusotmer Can't be Blank");
		}

		// 3. validate CustomerId
		if (customer.getCustomerId() <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer Id");
		}

		// 4. Validate Duplicate CustomerId

		if (customerRepository.existsById(customer.getCustomerId())) {
			throw new DuplicateCustomerFoundException(
					"Customer ID " + customer.getCustomerId() + " is already registered");
		}

		// 4. Validate Email
		if (customer.getEmail() == null
				|| !customer.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
			throw new InvalidEmailException("Invalid Email Format");
		}

		// 5. Validate Mobile Number
		if (customer.getMobile() == null || !customer.getMobile().matches("^[6-9]\\d{9}$")) {
			throw new InvalidMobileNumberException("Invalid Mobile Number");
		}

		// 6. Validate Pass
		if (customer.getPassword() == null || customer.getPassword().isBlank()) {
			throw new InvalidPasswordException("Password Can't be Blank");
		}

		if (customer.getPassword().length() < 8) {
			throw new InvalidPasswordException("Password Must Contain at least 8 Characters");
		}

		// 7. Check Duplicate Email
		Customer existingCustomer = customerRepository.getCustomerByEmail(customer.getEmail().trim());
		if (existingCustomer != null) {
			throw new DuplicateCustomerFoundException(
					"Registration failed ! Email " + customer.getEmail() + "is already registered");
		}

		// 8. Save Customer or Add Customer

		boolean isAdded = customerRepository.addCustomer(customer);

		if (!isAdded) {
			throw new DatabaseOperationException("Failed! to Register Customer");
		}

		System.out.println("Customer Registered Successfully");
	}

	// 2. Customer Login
	public Customer loginCustomer(String email, String password) throws SQLException {

		// 1. Validate Email
		if (email == null || email.isBlank()) {
			throw new EmailNotFoundException("Email cannot be blank");
		}

		// 2. Validate Password
		if (password == null || password.isBlank()) {
			throw new PasswordNotFoundException("Password cannot be blank");
		}

		// 3. Find customer by email
		Customer customer = customerRepository.getCustomerByEmail(email.trim());

		// 4. Check customer exists
		if (customer == null) {
			throw new CustomerNotFoundException("Login Failed! Customer with email '" + email + "' not found");
		}

		// 5. Verify password
		if (!customer.getPassword().equals(password)) {
			throw new InvalidPasswordException("Login Failed! Incorrect Password");
		}

		// 6. Login successful
		System.out.println("==================================");
		System.out.println("Login Successful!");
		System.out.println("Customer ID : " + customer.getCustomerId());
		System.out.println("Name        : " + customer.getCustomerName());
		System.out.println("Email       : " + customer.getEmail());
		System.out.println("==================================");

		return customer;
	}

	// 3. Get Customer By Id
	public Customer getCustomerById(int customerId) throws SQLException {

		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		Customer customer = customerRepository.getCustomerById(customerId);

		if (customer == null) {
			throw new CustomerNotFoundException("Customer not found with ID: " + customerId);
		}

		return customer;
	}

	// 4. Get All Customer
	public List<Customer> getAllCustomers() throws SQLException {
		List<Customer> customers = customerRepository.getAllCustomers();

		if (customers.isEmpty()) {
			throw new CustomerNotFoundException("Customer Not Found");
		}
		return customers;
	}

	// 5. Update Customer
	public void updateCustomer(Customer customer) throws SQLException {

		// 1. Validate customer object
		if (customer == null) {
			throw new CustomerNotFoundException("Customer Data Can't be Null");
		}

		// 2. Validate Customer ID
		if (customer.getCustomerId() <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		// 3. Check whether customer exists
		Customer existingCustomer = customerRepository.getCustomerById(customer.getCustomerId());

		if (existingCustomer == null) {
			throw new CustomerNotFoundException("Customer not found with ID: " + customer.getCustomerId());
		}

		// 4. Validate name
		if (customer.getCustomerName() == null || customer.getCustomerName().isBlank()) {

			throw new CustomerNotFoundException("Customer Name Can't be Blank");
		}

		// 5. Validate email
		if (customer.getEmail() == null
				|| !customer.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {

			throw new InvalidEmailException("Invalid Email Format");
		}

		// 6. Validate mobile
		if (customer.getMobile() == null || !customer.getMobile().matches("^[6-9]\\d{9}$")) {

			throw new InvalidMobileNumberException("Invalid Mobile Number");
		}

		// 7. Validate password
		if (customer.getPassword() == null || customer.getPassword().isBlank()) {

			throw new InvalidPasswordException("Password Can't be Blank");
		}

		if (customer.getPassword().length() < 8) {

			throw new InvalidPasswordException("Password must contain at least 8 characters");
		}

		// 8. Check duplicate email
		Customer emailCustomer = customerRepository.getCustomerByEmail(customer.getEmail().trim());

		if (emailCustomer != null && emailCustomer.getCustomerId() != customer.getCustomerId()) {

			throw new DuplicateCustomerFoundException("Email " + customer.getEmail() + " is already registered");
		}

		// 9. Update customer
		boolean updated = customerRepository.updateCustomer(customer);

		if (!updated) {
			throw new DatabaseOperationException("Failed to update customer");
		}

		System.out.println("Customer Updated Successfully!");
	}

	// 9. Delete Customer
	public void deleteCustomer(int customerId) throws SQLException {
		// 1. Validate Customer Id
		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		// 2. Check customer exists
		Customer customer = customerRepository.getCustomerById(customerId);

		if (customer == null) {
			throw new CustomerNotFoundException("Customer not found with ID: " + customerId);
		}

		// 3. Delete Customer
		boolean deleted = customerRepository.deleteCustomer(customerId);

		if (!deleted) {
			throw new DatabaseOperationException("DataBase failed to Delete Customer");
		}

		System.out.println("Customer Deleted Successfully!..");

		System.out.println("Customer ID : " + customerId);
	}
}
