package com.kodewala.exception5Atm;

class ATM {
	private double balance = 100000;

	public void withdraw(double amount) {
		try {
			System.out.println("Atm Transaction Started");
			if (amount > balance) {
				System.out.println("Insufficeint Balance");
			}else {
				balance -= amount;

				System.out.println("Withdraw Successfully ");
				System.out.println("Available Balance : " + balance);
			}	

		} catch (Exception e) {
			System.out.println("Transaction Failed");
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("Print Receipt..........");
			System.out.println("Thank You For Using ATM");
		}
		System.out.println("Transaction Completed");
	}
}
