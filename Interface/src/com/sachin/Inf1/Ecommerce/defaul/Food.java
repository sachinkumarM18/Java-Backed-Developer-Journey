package com.sachin.Inf1.Ecommerce.defaul;

public class Food implements DeliveryService {

	@Override
	public void pickupOrder() {
		System.out.println("Food : Pickup Order");
	}

	@Override
	public void packOrder() {
		System.out.println("Food : Pack Order");
	}

	@Override
	public void shipOrder() {
		System.out.println("Food : Order Shipped");
	}

	@Override
	public void trackOrder() {
		System.out.println("Food :Track Order");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Food :Cancel Order");
	}

}
