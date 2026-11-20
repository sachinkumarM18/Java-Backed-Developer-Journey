package com.kodewala.PaymentSystem2;

public class Driver {

	public static void main(String[] args) {
		Payment payment = new Payment();
		
		payment.pay(500);  // Cash Amount
		payment.pay(1000,"sachin@ybl");  // UPI Payment
		payment.pay(30000,"2824 2323 4860", "456" );  // Card Payment
		payment.pay("Paytm Wallet" , 800);  // Wallet Amount
	} 
}
