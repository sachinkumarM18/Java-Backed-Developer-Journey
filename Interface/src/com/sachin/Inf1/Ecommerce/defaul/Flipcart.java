package com.sachin.Inf1.Ecommerce.defaul;

public class Flipcart implements DeliveryService {

	@Override
	public void pickupOrder() {
		System.out.println("Flipcart : Pickup Your Order");
	}

	@Override
	public void packOrder() {
		System.out.println("Flipcart : Your Order Pack");

	}

	@Override
	public void shipOrder() {
		System.out.println("Flipcart : Order Shipped");

	}

	@Override
	public void trackOrder() {
		System.out.println("Flipcart :Track Order");

	}

	@Override
	public void cancelOrder() {
		System.out.println("Flipcart : Cancel Order");

	}

}
