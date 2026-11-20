package com.kodewala.PaymentSystem2;

 class Payment {
	 // Cash Payment 
	 void pay(double amount) {
		 System.out.println("Paid ₹" + amount + " by Cash");
	 }
 // UPI Payment
	 void pay(double amount , String upiId) {
	        System.out.println("Paid ₹" + amount + " using UPI: " + upiId);
	 }
	 
	 // Card Payment
	 void pay(double amount, String cardNumber, String cvv) {
		 System.out.println("Paid ₹" + amount + " using UPI: " + cardNumber);
	 }
	 
	 // Wallet Payment
	 void pay(String walletName, double amount) {
		 System.out.println("Paid ₹" + amount + " using " + walletName);
	 }
		 
	 
 }