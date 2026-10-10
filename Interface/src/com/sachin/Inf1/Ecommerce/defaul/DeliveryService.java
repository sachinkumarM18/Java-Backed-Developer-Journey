package com.sachin.Inf1.Ecommerce.defaul;

interface DeliveryService {
	void pickupOrder();
	void packOrder();
	void shipOrder();
	void trackOrder();
	void cancelOrder();
	
	public default void scheduleDelivery() {
		System.out.println("scheduled Delivery is not Supported.");
	}
}
