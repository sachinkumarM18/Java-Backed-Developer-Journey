package com.kodewala.createcons;

public class BankAccount {
	private String accountNum;
	private String customerName;
	private double balance;

	BankAccount(String accountNum, String customerName, double balance) {
		this.accountNum = accountNum;
		this.customerName = customerName;
		this.balance = balance;
	}

	public static void main(String[] args) {
		BankAccount bank = new BankAccount("240000170078560", "Sachin Kumar", 1526);
		bank.displayBankDetails();
		bank.withdrawAmount(500);
		bank.depositeAmount(1000);
		bank.displayBankDetails();
	}

	public void displayBankDetails() {
		System.out.println("Account Num ; " + accountNum);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Balance : " + balance);
	}

	public void withdrawAmount(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient Balance");
		} else {
			balance -= amount;
			System.out.println("Withdraw Successfully : " + amount);
			System.out.println("Available Balance : " + balance);
		}
	}

	public void depositeAmount(double amount) {
		if (amount < 0) {
			System.out.println("Amount must should be Greater than 0. ");
		} else {
			balance += amount;
			System.out.println("Deposite Successfully : " + amount);
			System.out.println("Available Balance : " + balance);
		}
	}
}
