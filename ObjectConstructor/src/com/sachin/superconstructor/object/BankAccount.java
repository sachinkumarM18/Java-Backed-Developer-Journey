package com.sachin.superconstructor.object;

class BankAccount {
	protected String accountNumber;
	protected String ifcsCode;
	
	public BankAccount(String accountNumber , String ifscCode) {
		this.accountNumber = accountNumber;
		this.ifcsCode = ifcsCode;
		
		System.out.println("BankingAccount Constructor");
	}
}
