package com.sachin.inheritance3.payment;

public class UPITest {

	public static void main(String[] args) {
		UPIPayment payment = new UPIPayment("TXN1001", 2500, "sachin@upi");
		payment.showPaymentDetails();
		payment.showDetails();
		payment.processPayment();
	}

}
