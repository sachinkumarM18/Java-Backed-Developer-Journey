package com.Kodewala.Thread4Synchronize;

public class BankDemo {

	public static void main(String[] args) throws InterruptedException {

		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();

		TransferThread1 t1 = new TransferThread1(account1, account2);
		TransferThread2 t2 = new TransferThread2(account1, account2);

		t1.setName("Thread -1");
		t2.setName("Thread -2");

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Account1 Balance : " + account1.getBalance());
		System.out.println("Account2 Balance : " + account2.getBalance());
	}

}
