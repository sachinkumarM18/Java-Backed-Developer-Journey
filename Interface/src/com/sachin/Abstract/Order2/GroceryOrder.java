package com.sachin.Abstract.Order2;

public class GroceryOrder extends Order {

	public GroceryOrder(String orderId) {
		super(orderId);
	}

	@Override
	public void placeOrder() {
		System.out.println("Grocery Order Placed : " + orderId);
		orderStatus = "Placed";
	}

	@Override
	public void editOrder() {
		System.out.println("Grocery order edited: " + orderId);
		orderStatus = "EDITED";
	}

	@Override
	public void confirmOrder() {
		System.out.println("Grocery order confirmed: " + orderId);
		orderStatus = "CONFIRMED";
	}

}
