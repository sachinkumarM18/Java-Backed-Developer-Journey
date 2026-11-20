package com.sachin.abstractClass2.BankAccount;

public class SavingAccount extends Account {
	double interestRate = 5.0;

	public SavingAccount(double balance) {
		super(balance);
	}

	@Override
	void calculateInterest() {
		double interest = (balance * interestRate) / 100;
		balance += interest;
		System.out.println("Interest Added : " + balance);
	}
}
