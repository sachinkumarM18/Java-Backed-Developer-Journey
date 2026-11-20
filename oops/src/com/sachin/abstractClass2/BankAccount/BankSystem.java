package com.sachin.abstractClass2.BankAccount;

public class BankSystem {

	public static void main(String[] args) {
		Account saving = new SavingAccount(5000);
		saving.showBalance();
		saving.calculateInterest();
		saving.showBalance();

		System.out.println("  ====================  ");

		Account current = new CurrentAccount(10115);
		current.showBalance();
		current.calculateInterest();
		current.showBalance();
	}

}
