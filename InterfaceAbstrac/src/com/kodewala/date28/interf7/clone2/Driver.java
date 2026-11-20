package com.kodewala.date28.interf7.clone2;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		BankAccount originalAccount = new BankAccount("Sachin Kumar", "SBI256555", 50000);
		BankAccount backupAccount = originalAccount.clone();
		backupAccount.balance = 75000;

		System.out.println("Original Account");
		System.out.println("Holder : " + originalAccount.accountHolder);
		System.out.println("Balance : " + originalAccount.balance);

		System.out.println();

		System.out.println("Backup Account");
		System.out.println("Holder : " + backupAccount.accountHolder);
		System.out.println("Balance : " + backupAccount.balance);
	}

}
