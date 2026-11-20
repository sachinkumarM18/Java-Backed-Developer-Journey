package com.ThreadPractice;

class Account {
	private final String id;
	private double balance;

	public Account(String id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public void withdrawAmount(double amount) {
		
//		if (amount <= 0) {
//			System.out.println("Amount Must be Greater than 0");
//		}
//		if (amount > balance) {
//			System.out.println("Insufficient Balance");
//		}

		this.balance -= amount;
	}

	public void depositAmount(double amount) {
//		if (amount <= 0) {
//			System.out.println("Amount Must be Greater than 0");
//		}

		this.balance += amount;
	}

	public String getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

}

class TransferRunnable implements Runnable {
	private final Account fromAccount;
	private final Account toAccount;
	private final double amount;

	// we are giving Structure to Withdraw or Deposit Amount
	public TransferRunnable(Account fromAccount, Account toAccount, double amount) {
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
	}

	@Override
	public void run() {
		
		// Determine alphabetical order to Completely prevent deadlocks
		
		Account firstLock = fromAccount.getId().compareTo(toAccount.getId()) < 0 ? fromAccount : toAccount;
		Account secondLock = firstLock == fromAccount ? toAccount : fromAccount;

		// Synchronized the first Account
		
		synchronized (firstLock) {
			try {
				
				// Simulate a small network delay using sleep
				
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("Thread Interrupted");
			}
		}

		// Synchronized on the second Account
		
		synchronized (secondLock) {

			if (fromAccount.getBalance() >= amount) {
				fromAccount.withdrawAmount(amount);
				toAccount.depositAmount(amount);
				System.out.println(Thread.currentThread().getName());
			} else {
				System.out.println(Thread.currentThread().getName() + "Fail : Insufficient Funds");
			}
		}
	}

}

class TransactionsAmount {

	public static void main(String[] args) {
		
		// 1. Create Two Accounts
		
		Account accountA = new Account("Anjali-101", 1000.0);
		Account accountB = new Account("Gaytri-001", 500.0);

		System.out.println("----- Initial Balances -----");
		System.out.println(accountA.getId() + ": $" + accountA.getBalance());
		System.out.println(accountB.getId() + ": $" + accountB.getBalance());
		System.out.println("Total System Value : $" + (accountA.getBalance() + accountB.getBalance()));
		System.out.println();

		// 2. Create two tasks (Runnables)
		// Thread 1 wants to transfer $200 from Anjali to Gayatri
		
		TransferRunnable task1 = new TransferRunnable(accountA, accountB, 200.0);
		
		// Thread 2 wants tp transfer $100 from Gayatri to Anjali
		
		TransferRunnable task2 = new TransferRunnable(accountB, accountA, 100.0);

		// 3. Create the Thread
		Thread thread1 = new Thread(task1, "Thread-Anjali");
		Thread thread2 = new Thread(task2, "Thread-Gayatri");

		// 4. Start the Thread
		thread1.start(); 
		thread2.start();

		// 5. Let the main thread sleep long enough to ensure both transfers finish
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}

		// 6. Calculate and display final total balance
		System.out.println("----- Final Balance -----");
		System.out.println(accountA.getId() + ": $" + accountA.getBalance());
		System.out.println(accountB.getId() + ": $" + accountB.getBalance());
		System.out.println("Total System Value : $" + (accountA.getBalance() + accountB.getBalance()));
	}

}
