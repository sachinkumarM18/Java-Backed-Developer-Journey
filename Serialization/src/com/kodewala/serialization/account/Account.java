package com.kodewala.serialization.account;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	private transient int balance;
	private String ifscCode;
	private String location;

	public Account(int balance, String ifscCode, String location) {
		this.balance = balance;
		this.ifscCode = ifscCode;
		this.location = location;
	}

	public int getBalance() {
		return balance;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", ifscCode=" + ifscCode + ", location=" + location + "]";
	}
}