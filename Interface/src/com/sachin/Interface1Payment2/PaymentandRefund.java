package com.sachin.Interface1Payment2;

interface PaymentandRefund extends Payment, Refund {

}

class RazorPay implements PaymentandRefund {

	@Override
	public void pay(double amount) {
		System.out.println("Processing Payment : " + amount);
	}

	@Override
	public void refund(double amount) {
		System.out.println("Processing Refund : " + amount);
	}

}