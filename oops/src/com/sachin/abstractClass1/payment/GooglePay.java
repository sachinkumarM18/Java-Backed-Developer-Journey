package com.sachin.abstractClass1.payment;

public class GooglePay extends Payment {

	public GooglePay(String transactionId) {
		super(transactionId);
	}

	@Override
	protected void authentication() {
		System.out.println("Authenticating Google Pay user...");
	}

	@Override
	protected void pay(double amount) {
		System.out.println("Processing Google Pay payment of ₹" + amount);
	}

}
