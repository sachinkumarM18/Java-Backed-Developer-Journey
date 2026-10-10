package com.sachin.Interface.Marker.Auditable;

public class BankAccount implements Auditable {
	private int accountNumber;
	private String holderName;
	private double balance;

	public BankAccount(int accountNumber, String holderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}

}
