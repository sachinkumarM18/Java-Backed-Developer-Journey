package com.sachin.polymor1;

class Payment {
	public void processPayment() {
		System.out.println("Payment In Processing");
	}
}

class CardPayment extends Payment {
	@Override
	public void processPayment() {
		System.out.println("Payment doing with Card");
	}
}

class UpiPayment extends Payment {
	@Override
	public void processPayment() {
		System.out.println("Payment doing with Upi");
	}
}

class NetBanking extends Payment {
	@Override
	public void processPayment() {
		System.out.println("Payment doing with NetBanking");
	}
}

public class Driver3 {

	public static void main(String[] args) {
		Payment payment;
		payment = new UpiPayment();
		payment.processPayment();

		payment = new CardPayment();
		payment.processPayment();

		payment = new NetBanking();
		payment.processPayment();
	}

}
