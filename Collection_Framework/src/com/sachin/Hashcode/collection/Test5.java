package com.sachin.Hashcode.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Customer {
	int customerId;
	String customerName;
	String email;

	public Customer(int customerId, String customerName, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(customerId));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customerId == other.customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email + "]";
	}

}

public class Test5 {

	public static void main(String[] args) {
		HashSet<Customer> customers = new HashSet<Customer>();
		Customer customer = new Customer(101, "Sachin Kumar", "sachin@018gmail.com");
		Customer customer1 = new Customer(101, "Sachin Kumar", "sachin@018gmail.com");
		Customer customer2 = new Customer(101, "Sachin Kumar", "sachin@018gmail.com");
		Customer customer3 = new Customer(101, "Sachin Kumar", "sachin@018gmail.com");

		System.out.println(customers);
		Iterator<Customer> itr = customers.iterator();
		while (itr.hasNext()) {
			Customer custom = itr.next();
			System.out.println(custom);
		}
	}

}
