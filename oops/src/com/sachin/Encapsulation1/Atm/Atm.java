package com.sachin.Encapsulation1.Atm;

public class Atm {
	private double balance;
	private int atmpin;

	public Atm(double balance, int atmpin) {
		this.balance = balance;
		this.atmpin = atmpin;
	}

	public void deposite(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid deposite Amount");
			return;
		}

		balance += amount;
		System.out.println("Amount Deposite : ₹" + amount);
		System.out.println("Current Balance : ₹" + balance);
	}

	public void withdraw(int pin, double amount) {
		if (pin != atmpin) {
			System.out.println("Invalid Atm Pin");
			return;
		}

		if (amount <= 0) {
			System.out.println("Invalid Withdrawal Amount");
			return;
		}

		if (amount > balance) {
			System.out.println("Insufficient Balance");
			return;
		}
		balance -= amount;
		System.out.println("Amount Withdraw :₹" + amount);
		System.out.println("Current Balance : ₹" + balance);
	}

	public double getBalance() {
		return balance;
	}

	public int getPin() {
		return atmpin;
	}

}
