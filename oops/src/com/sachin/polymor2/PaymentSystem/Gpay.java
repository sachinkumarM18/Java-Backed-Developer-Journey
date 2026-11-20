package com.sachin.polymor2.PaymentSystem;

class Gpay extends Payment {
	@Override
	public void paymentProcessing() {
		System.out.println("Payment with Google Pay");
	}
}
