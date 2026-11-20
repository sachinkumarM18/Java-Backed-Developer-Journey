package com.sachin.constructor.object;

class BankAccount {
	private String accountNumber;
	private String customerName;
	private double balance;

	// No -Arguments Constructor
	public BankAccount() {
		System.out.println("No Arguments Constructor");
		accountNumber = "2812655555";
		customerName = "Sachin";
		balance = 456666;
	}

	// Parameterized Constructor
	BankAccount(String accountNumber, String customerName, double balance) {
		System.out.println("Parameterized Constructor Called");
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	public void display() {
		System.out.println("---------------------------");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Balance : " + balance);
	}
}

public class Driver {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("240001700078560", "Abhi", 150000);
		BankAccount acc1 = new BankAccount();
		acc.display();
		acc1.display();
	}

}
