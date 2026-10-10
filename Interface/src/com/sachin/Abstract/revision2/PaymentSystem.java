package com.sachin.Abstract.revision2;

abstract class Payment {
	abstract void pay();
}

class UPI extends Payment {
	@Override
	void pay() {
		System.out.println("Doing payment with UPI");
	}

	void scanQrCode() {
		System.out.println("Scanning QR Code");
	}
}

class CreditCard extends Payment {
	@Override
	void pay() {
		System.out.println("Doing payment with Card");
	}

	void enterCardDetails() {
		System.out.println("Entering Card Details");
	}

}

class PaymentSystem {
	static void processPayment(Payment payment) {

		payment.pay();

		if (payment instanceof UPI) {
			System.out.println("This is a UPI payment");
			UPI upi = (UPI) payment;
			upi.scanQrCode();
		}

		if (payment instanceof CreditCard) {
			System.out.println("This is a Credit Card payment");
			CreditCard card = (CreditCard) payment;
			card.enterCardDetails();
		}
	}

	public static void main(String[] args) {
		Payment p1 = new UPI();
		Payment p2 = new CreditCard();

		processPayment(p1);
		
		System.out.println();
		
		processPayment(p2);
	}

}
