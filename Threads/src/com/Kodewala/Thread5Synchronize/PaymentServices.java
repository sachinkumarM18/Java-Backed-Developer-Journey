package com.Kodewala.Thread5Synchronize;

public class PaymentServices {
	public static int transactionId = 1000;

	public static synchronized int generateTransactionId() {
		transactionId++;
		System.out.println("[" + Thread.currentThread().getName() + "] Generate TransactionId : " + transactionId);
		return transactionId;
	}
}
 