package com.sachin.polymor2.PaymentSystem;

class UpiPayment extends Payment {
	@Override
	public void paymentProcessing() {
		System.out.println("Upi Payment ");
	}
}
