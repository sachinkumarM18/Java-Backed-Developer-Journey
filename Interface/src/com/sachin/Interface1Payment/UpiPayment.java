package com.sachin.Interface1Payment;

public class UpiPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Processing Payment With Upi : " + amount);
	}

}
