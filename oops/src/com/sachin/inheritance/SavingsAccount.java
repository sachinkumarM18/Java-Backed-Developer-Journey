package com.sachin.inheritance;

class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	@Override
	public void withdraw(double amount) {
		double interest = amount * interestRate / 100;
		double totalDeduction = amount + interest;

		if (totalDeduction > balance) {
			System.out.println("Insufficient Balance");
			return;
		}
		balance -= totalDeduction;

		System.out.println("Withdrawal: ₹" + amount);
		System.out.println("Interest: ₹" + interest);
		System.out.println("Total deducted: ₹" + totalDeduction);
		System.out.println("Remaining balance: ₹" + balance);
	}
}
