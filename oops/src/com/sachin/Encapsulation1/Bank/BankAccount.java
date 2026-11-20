package com.sachin.Encapsulation1.Bank;

class BankAccount {

	// Private State

	private final String accountNumber;
	private final String customerName;

	private double balance;
	private boolean active;

	// Constructor

	public BankAccount(String accountNumber, String customerName, double openingBalance) {

		if (accountNumber == null || accountNumber.isBlank()) {
			throw new IllegalArgumentException("Account Number is Required");
		}

		if (customerName == null || customerName.isBlank()) {
			throw new IllegalArgumentException("Customer Name is Required");
		}

		if (openingBalance < 0) {
			throw new IllegalArgumentException("Opening Balance cannot be Negative");
		}
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = openingBalance;
		this.active = true;
	}

	// Business Operation

	public void deposite(double amount) {
		validateActiveAccount();
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposite Amount must be Greater than Zero");
		}
		balance += amount;
	}

	public void withdraw(double amount) {

		validateActiveAccount();

		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
		}

		if (amount > balance) {
			throw new IllegalStateException("Insufficient balance");
		}

		balance -= amount;
	}

	public void closeAccount() {
		if (!active) {
			throw new IllegalArgumentException("Account is already closed");
		}

		if (balance > 0) {
			throw new IllegalStateException("Account cannot be closed with remaining balance");
		}
		active = false;
	}

	// Read Only Access

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getBalance() {
		return balance;
	}

	public boolean isActive() {
		return active;
	}

	// Internal Validation

	private void validateActiveAccount() {
		if (!active) {
			throw new IllegalArgumentException("Account is Inactive");
		}
	}

}
