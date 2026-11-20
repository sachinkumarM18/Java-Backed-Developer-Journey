package com.kodewala.date02.interf7.clone5;

class Customer {
	private String customerId;
	private String customerName;

	public Customer(String customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public void displayCustomer() {
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
	}
}
