package com.kodewala.date28.interf.finalex;

public class NetBanking implements PaymentService {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Net Banking Processing...");
		System.out.println("Payment Successful : ₹" + amount);
		generateReceipt(amount);
	}

	@Override
	public void history() {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
