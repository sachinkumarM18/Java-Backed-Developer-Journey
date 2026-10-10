package com.sachin.Abstract.Order2;

public class OnlineOrder extends Order {

	public OnlineOrder(String orderId) {
		super(orderId);
	}

	@Override
	public void placeOrder() {
		System.out.println("Online order Placed : " + orderId);
		orderStatus = "PLACED";
	}

	@Override
	public void editOrder() {
		System.out.println("Online order edited : " + orderId);
		orderStatus = "EDITED";
	}

	@Override
	public void confirmOrder() {
		System.out.println("Online Order Confirmed : " + orderId);
		orderStatus = "CONFIRMED";
	}

}
