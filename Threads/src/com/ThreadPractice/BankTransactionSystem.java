package com.ThreadPractice;

class BankAccount {
	private final int accountId;
	private int balance;

	public BankAccount(int accountId, int balance) {
		this.accountId = accountId;
		this.balance = balance;
	}

	public synchronized void deposite(int amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposite amount must be Positive");
		}
		System.out.println(Thread.currentThread().getName() + " -> Depositing rs : " + amount);
		balance += amount;
		System.out.println(Thread.currentThread().getName() + " -> Deposite Completed, Balance = " + balance);
		notifyAll();
	}

	public synchronized void withdraw(int amount) throws InterruptedException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdraw amount must be Positive");
		}
		while (balance < amount) {
			System.out.println(Thread.currentThread().getName() + " -> Insufficient Balance. waiting...");
			wait();
		}
		System.out.println(Thread.currentThread().getName() + " -> Withdrawing " + amount);
		balance -= amount;
		System.out.println(Thread.currentThread().getName() + " -> Withdraw Completed, Balance = " + balance);
	}

	public synchronized int getBalance() {
		return balance;
	}

	public int getAccountId() {
		return accountId;
	}
}

// Deposit Task

class DepositTask implements Runnable {
	private final BankAccount account;
	private final int amount;

	public DepositTask(BankAccount account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " -> Deposit task Started");
			Thread.sleep(1000);
			account.deposite(amount);
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " -> Deposit Task Completed");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println(Thread.currentThread().getName() + " -> Deposit Task Interrupted");
		}
	}

}

// Withdraw Task

class WithdrawalTask implements Runnable {
	private final BankAccount account;
	private final int amount;

	public WithdrawalTask(BankAccount account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " -> Withdrawal Task Started...");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " -> Withdrawal Task Completed..");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println(Thread.currentThread().getName() + " -> Withdrawal task Interrupted");
		}
	}

}

// Transfer Task

class TransferTask implements Runnable {
	private final BankAccount source;
	private final BankAccount destination;
	private final int amount;

	public TransferTask(BankAccount source, BankAccount destination, int amount) {
		this.source = source;
		this.destination = destination;
		this.amount = amount;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " -> Transfer Started...");
			source.withdraw(amount);
			Thread.sleep(500);
			destination.deposite(amount);
			System.out.println(Thread.currentThread().getName() + " -> Transfer Completed..");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println(Thread.currentThread().getName() + " -> Transfer Interrupted..");
		}
	}
}

/// Main Application

class BankTransactionSystem {

	public static void main(String[] args) throws InterruptedException {
		BankAccount accountA = new BankAccount(101, 2000);
		BankAccount accountB = new BankAccount(102, 500);

		System.out.println("======= Bank System Started =======");
		System.out.println("Account A Balance : " + accountA.getBalance());
		System.out.println("Account B Balance : " + accountB.getBalance());

		// Withdrawal -> Account A has 2000
		// This transaction require 50000
		// Therefore it will wait

		Thread withdrawalThread = new Thread(new WithdrawalTask(accountA, 5000), " -> Withdrawal-Thread");

		// Deposit
		// Adds 5000 to Account A
		// This will wake the waiting
		// Withdrawal thread.

		Thread depositThread = new Thread(new DepositTask(accountB, 5000), " -> Deposit-Thread");

		// Transfer

		Thread transferThread = new Thread(new TransferTask(accountA, accountB, 1000), " -> Transfer-Thread");

		// Starting Thread
		withdrawalThread.start();
		Thread.sleep(200);
		depositThread.start();
		Thread.sleep(200);
		transferThread.start();

		// Wait for all Threads to complete
		withdrawalThread.join();
		depositThread.join();
		transferThread.join();

		System.out.println("\n========== FINAL ACCOUNT STATUS ==========");
		System.out.println("Account A Balance : " + accountA.getBalance());
		System.out.println("Account b Balance : " + accountB.getBalance());
		System.out.println("========== BANK SYSTEM COMPLETED ==========");
	}

}
