package com.Kodewala.Thread5Synchronize;

public class PaymentThread1 extends Thread{
	@Override
	public void run() {
		PaymentServices.generateTransactionId();
	}
}
