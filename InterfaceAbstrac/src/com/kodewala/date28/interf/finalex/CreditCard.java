package com.kodewala.date28.interf.finalex;

public class CreditCard implements PaymentService {

	@Override
	public void processPayment(double amount) {
		System.out.println("Credit Card Processing...");
		System.out.println("Payment Successful : ₹" + amount);
		generateReceipt(amount);
	}

	@Override
	public void history() {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
