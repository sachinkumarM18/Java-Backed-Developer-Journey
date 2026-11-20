package com.kodewala.inter.paymentprocess;

public interface IPaymentGateway {
	void authentication();
	void validatePayment();
	void processPayment();
	
	// Java 7
	default void generateReceipt() {
		System.out.println("Receipt Generated");
	}
	void refund();
	void checkTransactionStatus();
}
