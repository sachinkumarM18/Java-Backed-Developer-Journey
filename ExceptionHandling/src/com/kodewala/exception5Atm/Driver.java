package com.kodewala.exception5Atm;

public class Driver {

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.withdraw(15000);
		
		System.out.println("Transaction End");
	}

}
