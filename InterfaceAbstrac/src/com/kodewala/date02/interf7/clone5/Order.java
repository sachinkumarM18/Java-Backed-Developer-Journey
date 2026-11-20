package com.kodewala.date02.interf7.clone5;

class Order implements Cloneable {
	private String orderId;
	private Customer customer;
	private Address address;
	private Payment payment;

	public Order(String orderId, Customer customer, Address address, Payment payment) {
		this.orderId = orderId;
		this.customer = customer;
		this.address = address;
		this.payment = payment;
	}

	@Override
	public Order clone() throws CloneNotSupportedException {
		return (Order) super.clone();
	}

	public void displayOrder() {

		System.out.println();
		System.out.println("=========== ORDER ===========");

		System.out.println("Order Id : " + orderId);

		customer.displayCustomer();
		address.displayAddress();
		payment.displayPayment();

		System.out.println("=============================");
	}
}
