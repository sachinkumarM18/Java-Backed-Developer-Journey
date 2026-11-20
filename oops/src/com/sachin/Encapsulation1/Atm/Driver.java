package com.sachin.Encapsulation1.Atm;

public class Driver {

	public static void main(String[] args) {
		Atm atm = new Atm(10000, 1985);
		atm.deposite(15000);
		atm.withdraw(1985, 25000);
	}

}
