package com.sachin.polymor3.Payment;

public class Driver {

	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();
		//GpayPayment payment = new GpayPayment();
		//processor.processPayment(payment);
		CardPayment payment = new CardPayment();
		processor.processPayment(payment);
	}

}
