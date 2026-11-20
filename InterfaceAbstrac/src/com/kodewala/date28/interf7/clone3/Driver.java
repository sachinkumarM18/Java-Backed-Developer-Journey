package com.kodewala.date28.interf7.clone3;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Customer originalCustomer = new Customer("C101", "Sachin Kumar", "sachin@gmail.com");
		Customer clonedCustomer = originalCustomer.clone();
		clonedCustomer.setCustomerName("Abhi Kumar");

		System.out.println("Original Customer");
		originalCustomer.displayCustomer();

		System.out.println("Cloned Customer");
		clonedCustomer.displayCustomer();
	}

}
