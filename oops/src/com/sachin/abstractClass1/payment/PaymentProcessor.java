package com.sachin.abstractClass1.payment;

public class PaymentProcessor {
	public void processPayment(Payment payment, double amount) {
		System.out.println("\nStarting Payment Processing");

		payment.process(amount);

		System.out.println("Payment Processing Completed");
	}
}
