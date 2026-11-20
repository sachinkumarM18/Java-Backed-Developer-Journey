package com.sachin.abstractClass1.payment;

public class CreditCard extends Payment {

	protected CreditCard(String transactionId) {
		super(transactionId);
	}

	@Override
	protected void authentication() {
		System.out.println("Validating card details...");
	}

	@Override
	protected void pay(double amount) {
		System.out.println("Processing Credit Card payment of ₹" + amount);
	}

}
