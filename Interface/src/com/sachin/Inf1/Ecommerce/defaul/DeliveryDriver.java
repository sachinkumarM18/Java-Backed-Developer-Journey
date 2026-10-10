package com.sachin.Inf1.Ecommerce.defaul;

public class DeliveryDriver {

	public static void main(String[] args) {
		DeliveryService amazon = new Amazon();
		amazon.pickupOrder();
		amazon.packOrder();
		amazon.shipOrder();
		amazon.trackOrder();
		amazon.cancelOrder();
		amazon.scheduleDelivery();

		System.out.println("--------------------------");

		DeliveryService flipcart = new Flipcart();
		flipcart.pickupOrder();
		flipcart.packOrder();
		flipcart.shipOrder();
		flipcart.trackOrder();
		flipcart.cancelOrder();
		flipcart.scheduleDelivery();

		System.out.println("--------------------------");

		DeliveryService food = new Food();
		food.pickupOrder();
		food.packOrder();
		food.shipOrder();
		food.trackOrder();
		food.cancelOrder();
		food.scheduleDelivery();

		System.out.println("--------------------------");

		DeliveryService grocery = new Grocery();
		grocery.pickupOrder();
		grocery.packOrder();
		grocery.shipOrder();
		grocery.trackOrder();
		grocery.cancelOrder();
		grocery.scheduleDelivery();

		System.out.println("--------------------------");
		
		DeliveryService pharma = new Pharmacy();
		pharma.pickupOrder();
		pharma.packOrder();
		pharma.shipOrder();
		pharma.trackOrder();
		pharma.cancelOrder();
		pharma.scheduleDelivery();
	}

}
