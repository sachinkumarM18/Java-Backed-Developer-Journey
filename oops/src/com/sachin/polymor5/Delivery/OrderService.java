package com.sachin.polymor5.Delivery;

class OrderService {
	public void processDelivery(Delivery delivery) {
		System.out.println("Processing delivery...");
		delivery.deliverOrder();
	}
}
