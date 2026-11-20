
// Single level Inheritance 

package com.sachin.inheritance4.types;

class PaymentCheck {
	void processPayment() {
		System.out.println("Payment Process Successfull");
	}

	void generateReceipt() {
		System.out.println("Receipt Generate Successfully");
	}
}

class UpiPayment extends PaymentCheck {
	void upiPayment() {
		System.out.println("Doing payment with UPI");
	}
}

// Testing the Upi and Payment
public class Payment {

	public static void main(String[] args) {
		UpiPayment pay = new UpiPayment();
		pay.processPayment();
		pay.upiPayment();
		pay.generateReceipt();
	}

}
