package com.kodewala.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerDriver {

	public static void main(String[] args) {
		Customer customer1 = new Customer(110, "Sachin");
		Customer customer2 = new Customer(10, "Pravez");
		Customer customer3 = new Customer(100, "Nitin");
		Customer customer4 = new Customer(120, "Jatin");

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);

		Collections.sort(customers, new CustomerByIdComparator());
		// For Each Loop

//		for (Customer customer : customers) {
//			System.out.println(customer);
//		}

		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			System.out.println(c.customerId + " , " + c.customerName);
		}

//		for (int i = 0; i < customers.size(); i++) {
//			Customer c = customers.get(i);
//			System.out.println(c.customerId + " , " + c.customerName);
//		}
	}

}
