package com.kodewala.date02.interf7.clone5;

class Payment {
	private String paymentMode;
	private double amount;

	public Payment(String paymentMode, double amout) {
		super();
		this.paymentMode = paymentMode;
		this.amount = amout;
	}

	public void displayPayment() {
		System.out.println("payment Mode : " + paymentMode);
		System.out.println("Amount : " + amount);
	}
}
