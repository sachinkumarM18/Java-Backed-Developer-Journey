package com.sachin.Interface1Payment;

public class NetBanking implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Processing Payment With Net Banking : " + amount);
	}

}
