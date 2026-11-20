package com.sachin.inheritance;

class BankAccount {
	protected String accountNumber;
	protected double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposite(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Deposite amount");
			return;
		}
		balance += amount;
		System.out.println("Deposited Balance : " + amount);
		System.out.println("Current Balance : " + balance);
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Amount must should be greater than 0");
			return;
		}

		if (amount > balance) {
			System.out.println("Insufficient Balance");
			return;
		}
		balance -= amount;
		System.out.println("Amount Withdraw :₹" + amount);
		System.out.println("Current Balance : ₹" + balance);
	}

	public void showBalance() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);
	}
}
