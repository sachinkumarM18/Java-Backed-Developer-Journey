package com.sachin.inheritance8.covarient;

class Order {
	Order processOrder() {
		System.out.println("Processing Order");
		return new Order();
	}

	void generateInvoice() {
		System.out.println("Generating Generic Invoice...");
	}
}

class OnlineOrder extends Order {
	@Override
	OnlineOrder processOrder() {
		System.out.println("Processing online order...");
		return new OnlineOrder();
	}

	void sendTrackingDetails() {
		System.out.println("Sending Tracking Details");
	}
}

public class Driver4 {

	public static void main(String[] args) {
		OnlineOrder order = new OnlineOrder();
		OnlineOrder processOrder = order.processOrder();
		processOrder.generateInvoice();
		processOrder.sendTrackingDetails();
	}

}
