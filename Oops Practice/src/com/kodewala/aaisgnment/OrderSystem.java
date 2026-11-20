package com.kodewala.aaisgnment;

public abstract class OrderSystem {
	// Abstract Methods
	public abstract void placeOrder();
	public abstract void editOrder();
	public abstract void confirmOrder();
	
	// concrete Method
	
	public void getOrderStatus() {
		System.out.println("OrderSystem.getOrderStatus()");
	}
}

