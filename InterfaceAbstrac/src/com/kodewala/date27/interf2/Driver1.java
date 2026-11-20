package com.kodewala.date27.interf2;

public class Driver1 {

	public static void main(String[] args) {

		System.out.println("========== UPI PAYMENT ==========");
		processPayment(new UpiId(), 15000, 1200);

		System.out.println();

		System.out.println("========== CARD PAYMENT ==========");
		processPayment(new Card(), 5555, 1500);
	}

	/**
	 * Common payment processing method. Any payment implementation can be passed
	 * here.
	 */
	private static void processPayment(IPayment paymentService, double amount, double availableBalance) {

		paymentService.pay(amount);
		paymentService.checkBal(availableBalance);
		paymentService.showtxn();
	}
}