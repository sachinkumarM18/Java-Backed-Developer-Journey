package com.kodewala.gettersetter2;

public class Driver {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("HDFC1001", "Sachin Kumar", 10000, false);
		System.out.println( "Availabe Balance is : "   + "₹" + account.getBalance());
		
		account.deposite(15000);
		System.out.println( "Availabe Balance is : "   + "₹" + account.getBalance());
		
		account.withdraw(20000);
		System.out.println( "Availabe Balance is : "   + "₹" + account.getBalance());
		
		account.setAccountHolderName("AhirZade Sachin");
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getBalance());
	}

}
