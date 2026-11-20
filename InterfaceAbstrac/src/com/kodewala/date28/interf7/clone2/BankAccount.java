package com.kodewala.date28.interf7.clone2;

class BankAccount implements Cloneable {
	String accountHolder;
	String accountNumber;
	double balance;

	public BankAccount(String accountHolder, String accountNumber, double balance) {

		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public BankAccount clone() throws CloneNotSupportedException {
		return (BankAccount) super.clone();
	}

}
