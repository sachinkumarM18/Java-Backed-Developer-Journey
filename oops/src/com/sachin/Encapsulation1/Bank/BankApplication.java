package com.sachin.Encapsulation1.Bank;

public class BankApplication {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("2400001700078560", "Sachin", 10000);
		account.deposite(5000);
		account.withdraw(2000);

		System.out.println("Balance : " + account.getBalance());
		System.out.println("Active : " + account.isActive());
	}

}
