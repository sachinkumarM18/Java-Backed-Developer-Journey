package com.sachin.Interface1Payment;

public class CardPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Processing Payment With CardPayment : " + amount);
	}

}
