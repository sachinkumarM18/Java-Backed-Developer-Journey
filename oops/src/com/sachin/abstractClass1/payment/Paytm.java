package com.sachin.abstractClass1.payment;

public class Paytm extends Payment {

	protected Paytm(String transactionId) {
		super(transactionId);
	}

	@Override
	protected void authentication() {
		System.out.println("Authenticating Paytm user...");
	}

	@Override
	protected void pay(double amount) {
		System.out.println("Processing Paytm payment of ₹" + amount);
	}

}
