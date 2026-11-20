package com.kodewala.paymentSystem;

class Payment {
	void pay(double amount) {
		System.out.println("Processing Payment...");
	}
}

class UpiPayment extends Payment{
	@Override
	void pay(double amount) {
		System.out.println("₹" + amount + " paid using Upi.");
	}
}

class PhonePayPayment extends Payment{
	@Override
	void pay(double amount) {
		System.out.println("₹" + amount + " paid using PhonePay.");
	}
}

class GooglePayPayment extends Payment{
	@Override
	void pay(double amount) {
		System.out.println("₹" + amount + " paid using GooglePay.");
	}
}

class CardPayment extends Payment{
	@Override
	void pay(double amount) {
		System.out.println("₹" + amount + " paid using CardPayment.");
	}
}

class NetBankingPayment extends Payment{
	@Override
	void pay(double amount) {
		System.out.println("₹" + amount + " paid using Net Banking.");
	}
}

