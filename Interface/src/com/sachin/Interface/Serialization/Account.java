package com.sachin.Interface.Serialization;

import java.io.Serializable;

public class Account implements Serializable {
	public static final long SerialVersionUID = 1L;
	private String name;
	private int balance;
	private String ifcsCode;
	private String location; 

	public Account(String name, int balance, String ifcsCode, String location) {
		super();
		this.name = name;
		this.balance = balance;
		this.ifcsCode = ifcsCode;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public String getIfcsCode() {
		return ifcsCode;
	}

	public String getLocation() {
		return location;
	}

}
