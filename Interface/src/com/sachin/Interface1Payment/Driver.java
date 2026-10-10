package com.sachin.Interface1Payment;

public class Driver {

	public static void main(String[] args) {
		Payment payment;
		payment = new UpiPayment();
		payment.pay(5000);

		payment = new Razorpay();
		payment.pay(4000);

		payment = new CardPayment();
		payment.pay(8000);

		payment = new NetBanking();
		payment.pay(10000);
	}

}
