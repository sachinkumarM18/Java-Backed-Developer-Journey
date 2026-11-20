package com.kodewala.createcons;

public class BankAccount1 {

	// Instance Variables
	private String accountNumber;
	private String customerName;
	private double balance;

	// Constructor
	public BankAccount1(String accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;

		System.out.println("Bank Account Created Successfully");
	}

	// Deposit Money
	public void deposit(double amount) {

		if (amount <= 0) {
			System.out.println("Deposit amount must be greater than 0.");
			return;
		}

		balance += amount;

		System.out.println("--------------------------------");
		System.out.println("Deposit Successful");
		System.out.println("Deposited Amount : ₹" + amount);
		System.out.println("Available Balance : ₹" + balance);
		System.out.println("--------------------------------");
	}

	// Withdraw Money
	public void withdraw(double amount) {

		if (amount <= 0) {
			System.out.println("Withdrawal amount must be greater than 0.");
			return;
		}

		if (amount > balance) {
			System.out.println("Insufficient Balance.");
			return;
		}

		balance -= amount;

		System.out.println("--------------------------------");
		System.out.println("Withdrawal Successful");
		System.out.println("Withdrawn Amount : ₹" + amount);
		System.out.println("Available Balance : ₹" + balance);
		System.out.println("--------------------------------");
	}

	// Display Account Details
	public void displayAccountDetails() {

		System.out.println("\n========== ACCOUNT DETAILS ==========");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Customer Name  : " + customerName);
		System.out.println("Balance        : ₹" + balance);
		System.out.println("=====================================\n");
	}

	public static void main(String[] args) {

		BankAccount1 account = new BankAccount1("240000170078560", "Sachin Kumar", 5000);

		account.displayAccountDetails();

		account.deposit(2500);

		account.withdraw(3000);

		account.displayAccountDetails();
	}
}