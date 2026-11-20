package com.sachin.superconstructor.object;

class SavingAccount extends BankAccount {

	private String customerName;
	private double balance;

	public SavingAccount(String accountNumber, String ifscCode, String customerName, double balance) {
		super(accountNumber, ifscCode);
		this.customerName = customerName;
		this.balance = balance;

		System.out.println("Saving Account Constructor");
	}

	public void display() {
		System.out.println("\n------Account Details------");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("IFSC Code      : " + ifcsCode);
		System.out.println("Customer Name  : " + customerName);
		System.out.println("Balance        : " + balance);
	}

}
