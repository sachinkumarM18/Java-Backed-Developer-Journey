package com.Kodewala.Thread5Synchronize;

public class PaymentDemo {

	public static void main(String[] args) throws InterruptedException {
		PaymentThread1 t1 = new PaymentThread1();
		PaymentThread2 t2 = new PaymentThread2();

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

}
