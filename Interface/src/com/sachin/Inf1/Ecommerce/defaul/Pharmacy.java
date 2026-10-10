package com.sachin.Inf1.Ecommerce.defaul;

public class Pharmacy implements DeliveryService {

	@Override
	public void pickupOrder() {
		System.out.println("Pharmacy : Pickup Order");
	}

	@Override
	public void packOrder() {
		System.out.println("Pharmacy : Pack Order");
	}

	@Override
	public void shipOrder() {
		System.out.println("Pharmacy : Order Shipped");
	}

	@Override
	public void trackOrder() {
		System.out.println("Pharmacy :Track Order");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Pharmacy : Cancel Order");
	}

	@Override
	public void scheduleDelivery() {
		System.out.println("Pharmacy : Delivery Schedule For Your Item");
	}
}
