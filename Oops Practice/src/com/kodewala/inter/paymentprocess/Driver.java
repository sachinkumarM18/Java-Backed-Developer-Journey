package com.kodewala.inter.paymentprocess;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPaymentGateway payment = new GooglePay();
		payment.authentication();
		payment.validatePayment();
		payment.processPayment();
		payment.generateReceipt();
		payment.refund();
		

	}

}
