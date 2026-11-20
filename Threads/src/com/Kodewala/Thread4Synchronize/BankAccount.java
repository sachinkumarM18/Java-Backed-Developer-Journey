package com.Kodewala.Thread4Synchronize;

class BankAccount {
	private static int balance = 1000;

	public static void transfer(BankAccount receiver, int amount) {
		System.out.println("[" + Thread.currentThread().getName()
				+ "] 20 lines code - sending email nitifcations.. requested to fund transfer");

		synchronized (BankAccount.class) {
			if (balance >= amount) {
				System.out.println("[" + Thread.currentThread().getName() + "] checked balance : " + balance);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance = balance - amount;
				receiver.balance = receiver.balance + amount;
				System.out.println("[" + Thread.currentThread().getName() + "] transfered " + amount);
			} else {
				System.out.println("[" + Thread.currentThread().getName() + "] Insuffucient Balance");
			}
		}
		System.out.println("20 lines of code - sending email notifications.... completed the fund transfer");
	}

	public int getBalance() {
		return balance;
	}

}
