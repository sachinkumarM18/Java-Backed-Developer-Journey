package com.kodewala.date27.interf2;

public class Driver {

	public static void main(String[] args) {
		IPayment payment = new UpiId();
		payment.pay(15000);
		payment.checkBal(1200);
		payment.showtxn();
		
		System.out.println("<-------------->");
		
		IPayment payment1 = new Card();
		payment1.pay(5555);
		payment1.checkBal(1500);
		payment1.showtxn();
	}

}
