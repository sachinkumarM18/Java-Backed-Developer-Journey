package com.sachin.Interface1Payment;

public class Razorpay implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Processing Payment With RazorPay : " + amount);
	}

}
