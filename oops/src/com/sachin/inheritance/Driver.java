package com.sachin.inheritance;

public class Driver {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount("2400001700078560", 50000, 6.5);
		account.deposite(10000);
		account.withdraw(50000);
		account.showBalance();
	}
}