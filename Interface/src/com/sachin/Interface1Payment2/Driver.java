package com.sachin.Interface1Payment2;

public class Driver {

	public static void main(String[] args) {
		PaymentandRefund payment;
		payment = new RazorPay();
		payment.pay(500);
		payment.refund(400);
	}

}
