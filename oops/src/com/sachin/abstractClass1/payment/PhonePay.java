package com.sachin.abstractClass1.payment;

public class PhonePay extends Payment {

	public PhonePay(String transactionId) {
		super(transactionId);
	}

	@Override
	protected void authentication() {
		System.out.println("Authenticating PhonePay User...");
	}

	@Override
	protected void pay(double amount) {
		System.out.println("processing PhonePay Payment of ₹ " + amount);
	}

}
