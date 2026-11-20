package com.sachin.inheritance1;

class Order {
	protected String orderId;
	protected double amount;

	public Order(String orderId, double amount) {

		this.orderId = orderId;
		this.amount = amount;

		System.out.println("Order Constructor");
	}

	public void processOrder() {
		System.out.println("Processing Normal Order");
	}
}
