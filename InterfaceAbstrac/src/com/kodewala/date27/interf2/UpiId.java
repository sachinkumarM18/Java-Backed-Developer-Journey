package com.kodewala.date27.interf2;

public class UpiId implements IPayment{

	@Override
	public void pay(double amount) {
		System.out.println("Upi Payment Successfully : " +amount);
		
	}

	@Override
	public void showtxn() {
		System.out.println("Transaction Details :" );
		
	}

	@Override
	public void checkBal(double balance) {
		System.out.println("Check Account Balance : " + balance);
		
	} 
	
	
}	
