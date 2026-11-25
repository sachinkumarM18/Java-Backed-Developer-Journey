
package com.xmlbeanCreation.service;

public class PaymentService {

	private String paymentMode;

	public void processPayment(double amount) {

		System.out.println("\n--- PROCESSING PAYMENT ---");

		System.out.println("Payment Mode: " + paymentMode);
		System.out.println("Amount Rs: " + amount);
		System.out.println("Payment Successfully Completed!");
	}

	public String getPaymentMode() {
		return paymentMode; 
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
}
