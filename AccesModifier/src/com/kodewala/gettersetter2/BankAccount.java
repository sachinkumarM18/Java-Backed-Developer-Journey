package com.kodewala.gettersetter2;

class BankAccount {
	// Bussiness Data
	private final String accountNumber;
	private String accountHolderName;
	private double balance;
	private boolean active;

	// Constructor
	public BankAccount(String accountNumber, String accountHolderName, double openingBalance, boolean active) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = openingBalance;
		this.active = true;
	}

	// Getters
	public String getAccountNumber() {
		
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		
		return balance;
	}

	public boolean isActive() {
		return active;
	}

	// Setters
	public void setAccountHolderName(String accountHolderName) {
		if (accountHolderName != null && !accountHolderName.isBlank()) {
			this.accountHolderName = accountHolderName;
			System.out.println("Account Holder Name Updated");
		} else {
			System.out.println("Invalid Name");
		}

	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	// Bussiness Method

	public void deposite(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Deposite Amount");
			return;
		}

		balance += amount;
		System.out.println("₹" + amount + " deposited successfully.");
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Withdraw AMount.");
			return;
		}

		if (amount > balance) {
			System.out.println("Insufficient Balance.");
			return;
		}

		balance -= amount;
		System.out.println("₹" + amount + " withdrawn successfully.");

	}

	public void deactivateAccount() {
		active = false;
		System.out.println("Account Deactivated");
	}

}
