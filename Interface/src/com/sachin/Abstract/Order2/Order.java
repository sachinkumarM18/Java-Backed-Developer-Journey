package com.sachin.Abstract.Order2;

abstract class Order {
	protected String orderId;
	protected String orderStatus;

	public Order(String orderId) {
		super();
		this.orderId = orderId;
		this.orderStatus = "CREATED";
	}

	// Contract
	public abstract void placeOrder();

	public abstract void editOrder();

	public abstract void confirmOrder();

	// Common Functionality

	public String getOrderStatus() {
		return orderStatus;
	}

}
