package com.kodewala.date28.interf7.clone3;

class Customer implements Cloneable {
	private String customerId;
	private String customerName;
	private String email;

	public Customer(String customerId, String customerName, String email) {

		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
	}

	@Override
	public Customer clone() throws CloneNotSupportedException {
		return (Customer) super.clone();
	}

	public void displayCustomer() {
		System.out.println("-------------------------------");
		System.out.println("Customer ID   : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Email         : " + email);
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
