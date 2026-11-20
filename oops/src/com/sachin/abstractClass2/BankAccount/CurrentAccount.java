package com.sachin.abstractClass2.BankAccount;

public class CurrentAccount extends Account {

	public CurrentAccount(double balance) {
		super(balance);
	}

	@Override
	void calculateInterest() {
		System.out.println("No Interest for Current Account");
	}

}
