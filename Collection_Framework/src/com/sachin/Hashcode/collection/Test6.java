package com.sachin.Hashcode.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Customer {

	private final int customerId;
	private final String customerName;
	private final String email;

	public Customer(int customerId, String customerName, String email) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}

	// Customer identity = customerId
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Customer)) {
			return false;
		}

		Customer other = (Customer) obj;

		return customerId == other.customerId;
	}

	// Must be consistent with equals()
	@Override
	public int hashCode() {

		return Objects.hash(customerId);
	}

	@Override
	public String toString() {

		return "Customer{" + "customerId=" + customerId + ", customerName='" + customerName + '\'' + ", email='" + email
				+ '\'' + '}';
	}
}

 class Test6 {

	public static void main(String[] args) {

		// Program against Set interface
		Set<Customer> customers = new HashSet<>();

		customers.add(new Customer(101, "Sachin Kumar", "sachin@gmail.com"));

		customers.add(new Customer(102, "Rahul", "rahul@gmail.com"));

		customers.add(new Customer(103, "Amit", "amit@gmail.com"));

		// Duplicate customerId
		customers.add(new Customer(101, "Another Name", "another@gmail.com"));

		System.out.println("Total Customers: " + customers.size());

		System.out.println("\nCustomers:");

		Iterator<Customer> iterator = customers.iterator();

		while (iterator.hasNext()) {

			Customer customer = iterator.next();

			System.out.println(customer);
		}
	}
}