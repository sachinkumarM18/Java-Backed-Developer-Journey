package com.sachin.polymor5.Delivery;

public class DeliveryApp {

	public static void main(String[] args) {
		OrderService orderService = new OrderService();

		Delivery delivery = new StandardDelivery();
		orderService.processDelivery(delivery);

		delivery = new ExpressDelivery();
		orderService.processDelivery(delivery);

		delivery = new SameDayDelivery();
		orderService.processDelivery(delivery);
	}

}
