package com.kodewala.date28.interf7.consumer;

import java.util.function.Consumer;

public class Driver {

	public static void main(String[] args) {
		Order order = new Order(101, "Abhi", 59999.0);

		// Save Order

		Consumer<Order> saveOrder = o -> {
			System.out.println("==============================");
			System.out.println("Saving Order Into Database...");
			System.out.println("Order Id : " + o.getOrderId());
			System.out.println("Customer : " + o.getCustomerName());
			System.out.println("Amount   : ₹" + o.getAmount());
		};

		// Send Email

		Consumer<Order> sendEmail = o -> {
			System.out.println("--------------------------------");
			System.out.println("Sending Confirmation Email...");
			System.out.println("Dear " + o.getCustomerName() + ", your order has been placed successfully.");
		};

		// Generate Invoice

		Consumer<Order> generateInvoice = o -> {
			System.out.println("--------------------------------");
			System.out.println("Generating Invoice...");
			System.out.println("Invoice Generated for Order : " + o.getOrderId());
		};

		// Audit Log

		Consumer<Order> auditing = o -> {
			System.out.println("--------------------------------");
			System.out.println("Audit Log Created");
		};

		// Execute all Consumer in Sequence

		saveOrder.andThen(sendEmail).andThen(generateInvoice).andThen(auditing).accept(order);
		System.out.println("=====================");
	}

}
