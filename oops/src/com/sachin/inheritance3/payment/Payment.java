package com.sachin.inheritance3.payment;

class Payment {
	protected String transactionId;
	protected double amount;

	public Payment(String transactionId, double amount) {

		this.transactionId = transactionId;
		this.amount = amount;
		System.out.println("Payment Constructor");
	}

	public void processPayment() {
		System.out.println("Processing Generic Payment");
	}

	public void showPaymentDetails() {
		System.out.println("Transaction ID : " + transactionId);
		System.out.println("Amount : " + amount);
	}
}
