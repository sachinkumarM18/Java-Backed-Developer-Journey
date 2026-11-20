package com.kodewala.date28.interf.finalex;

import java.time.LocalDateTime;

public interface PaymentService {

	// Abstract Method
	void processPayment(double amount);

	void history();
	// =======

	// Default Method
	default void generateReceipt(double amount) {
		System.out.println("Receipt Generation Started");

		System.out.println("\n=========Receipt==========");
		System.out.println("Amount Paid : ₹ " + amount);
		System.out.println("Status    : Success");
		 System.out.println("Generated At : " + getCurrentTime());
		System.out.println("=============================\n");
	}

	// ===============
	// Static Method
	// ===============

	static void printPaymentPolicy() {
		System.out.println("\n====== PAYMENT POLICY ======");
		System.out.println("Maximum Amount : ₹2,00,000");
		System.out.println("Retry Limit    : 3");
		System.out.println("Supported Mode : UPI, CARD, NET BANKING");
		System.out.println("============================\n");

	}

	// =================
	// Private Method (java 9)
	// ===================

//	private void printLog(String message) {
//		System.out.println("[Log] " + message);
//	}

	// ===================
	// Private Static Method (java 9)
	// ====================
	private static String getCurrentTime() {
		return LocalDateTime.now().toString();
	}

}
