package com.sachin.inheritance3.payment;

class UPIPayment extends Payment{
	private String upiId;
	public UPIPayment(String transactionId, double amount , String upiId) {
		super(transactionId, amount);
		this.upiId = upiId;
		 System.out.println("UPI constructor");
	}
	
	@Override
	
	public void processPayment() {
		System.out.println("Starting UPi payment");
		super.processPayment();
		System.out.println("Processing payment through UPi ID : " + upiId);
		System.out.println("UPI Payment Successfully");
	}
	
	public void showDetails() {
		System.out.println("UPI ID : " + upiId);
	}

} 
