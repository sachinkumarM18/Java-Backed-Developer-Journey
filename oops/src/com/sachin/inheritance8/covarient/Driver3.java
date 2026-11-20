package com.sachin.inheritance8.covarient;

class Payment {
	Payment processPayment() {
		return new Payment();
	}
}

class upiPayment extends Payment {
	@Override
	upiPayment processPayment() {
		System.out.println("Processing UPI payment...");
		return new upiPayment();
	}
	
	void generateUpiReceipt() {
		System.out.println("Generating UPi Receipt ...");
	}
}

public class Driver3 {

	public static void main(String[] args) {
		upiPayment payment = new upiPayment();
		upiPayment result = payment.processPayment();
		result.generateUpiReceipt();
	}

}
