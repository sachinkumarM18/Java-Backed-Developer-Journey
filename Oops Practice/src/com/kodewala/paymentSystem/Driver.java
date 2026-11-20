package com.kodewala.paymentSystem;

public class Driver {

	public static void main(String[] args) {
		Payment payment;
		
		payment = new UpiPayment();
		payment.pay(10000);
		
		payment = new PhonePayPayment();
		payment.pay(150000);
		
		payment = new GooglePayPayment();
		payment.pay(20000);

		payment = new CardPayment();
		payment.pay(250000);
		
		payment = new NetBankingPayment();
		payment.pay(5000000);
	}

}
