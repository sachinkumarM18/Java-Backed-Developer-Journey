package com.sachin.abstractClass1.payment;

public class NetBanking extends Payment {

	protected NetBanking(String transactionId) {
		super(transactionId);
	}

	@Override
	protected void authentication() {
		System.out.println("Authenticating bank credentials...");
	}

	@Override
	protected void pay(double amount) {
		System.out.println("Processing Net Banking payment of ₹" + amount);
	}

}
