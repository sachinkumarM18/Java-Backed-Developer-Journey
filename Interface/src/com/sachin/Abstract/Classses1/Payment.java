package com.sachin.Abstract.Classses1;

public abstract class Payment {
	 public abstract void doTxn();
	 public abstract void suspendTxn();
	 
	 public void sendSms() {
		 System.out.println("Transaction Successfull");
	 }
}

class UpiPayment extends Payment{

	@Override
	public void doTxn() {
		System.out.println("Doing Transaction");
		
	}

	@Override
	public void suspendTxn() {
		System.out.println("Transaction has been Suspen due to teachnical issue.");
	}
	
}
