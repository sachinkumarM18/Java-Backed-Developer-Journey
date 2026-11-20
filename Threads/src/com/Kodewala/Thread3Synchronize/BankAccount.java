package com.Kodewala.Thread3Synchronize;

public class BankAccount {
	private int balance = 1000;

	public void transfer(BankAccount receiver, int amount) { // 200 lines
		System.out.println("[" + Thread.currentThread().getName()
				+ "] 20 lines Code - Sending email notification... requested the fund transfer ");
		synchronized (this) {  // Better Performance

			if (balance >= amount) {
				System.out.println("[" + Thread.currentThread().getName() + " ] checked balance : " + balance);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance = balance - amount;
				receiver.balance = receiver.balance + amount;
				System.out.println("[" + Thread.currentThread().getName() + " ] transferred : " + amount);
			} else {
				System.out.println("[" + Thread.currentThread().getName() + " ] Insufficient Balance");
			}
		}
		System.out.println(" 20 lines code - sending email notification ... completed the found transfer");
	}

	public int getBalance() {
		return balance;
	}
}
