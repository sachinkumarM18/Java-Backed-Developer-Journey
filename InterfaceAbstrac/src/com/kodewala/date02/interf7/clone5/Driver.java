package com.kodewala.date02.interf7.clone5;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Customer customer = new Customer("C101", "Sachin");
		Address address = new Address("Btm 2nd Stage", "Bengaluru");
		Payment payment = new Payment("UPI", 2500);
		Order originalOrder = new Order("ORD1001", customer, address, payment);

		Order clonedOrder = originalOrder.clone();

		System.out.println("Original Order");
		originalOrder.displayOrder();

		System.out.println();

		System.out.println("Cloned Order");
		clonedOrder.displayOrder();
	}

}
