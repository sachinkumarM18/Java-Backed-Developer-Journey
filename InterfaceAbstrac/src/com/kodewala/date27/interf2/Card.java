package com.kodewala.date27.interf2;

public class Card implements IPayment{

	@Override
	public void pay(double amount) {
		System.out.println("Card Payment Successfully : " + amount);
		
	}

	@Override
	public void showtxn() {
		System.out.println("Show Transaction");
	}

	@Override
	public void checkBal(double balance) {
		System.out.println("Check Balance : " + balance);
	}

}
