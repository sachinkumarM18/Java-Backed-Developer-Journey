package com.Kodewala.Thread5Synchronize;

public class PaymentThread2 extends Thread {
	@Override
	public void run() {
		PaymentServices.generateTransactionId();
	}
}
