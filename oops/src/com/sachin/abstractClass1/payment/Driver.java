package com.sachin.abstractClass1.payment;

public class Driver {

	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();

		Payment payment = new PhonePay("TXN1001");
		processor.processPayment(payment, 1500);
	}

}
