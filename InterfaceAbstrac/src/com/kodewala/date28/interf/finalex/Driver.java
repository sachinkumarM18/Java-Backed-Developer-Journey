package com.kodewala.date28.interf.finalex;

public class Driver {

	public static void main(String[] args) {
		PaymentService googlePay = new GooglePay();
		PaymentService creditCard = new CreditCard();
		PaymentService netBanking = new NetBanking();

		googlePay.processPayment(1500);
		creditCard.processPayment(2500);
		netBanking.processPayment(5000);

		PaymentService.printPaymentPolicy();
	}

}
