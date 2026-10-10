package com.sachin.Inf1.Ecommerce.defaul;

public class Grocery implements DeliveryService {

	@Override
	public void pickupOrder() {
		System.out.println("Grocery : Pickup Order");
	}

	@Override
	public void packOrder() {
		System.out.println("Grocery : Pack Order");
	}

	@Override
	public void shipOrder() {
		System.out.println("Grocery : Order Shipped");
	}

	@Override
	public void trackOrder() {
		System.out.println("Grocery : Track Order");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Grocery : Cancel Order");
	}

}
