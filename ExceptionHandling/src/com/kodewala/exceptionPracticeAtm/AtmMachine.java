package com.kodewala.exceptionPracticeAtm;

class AtmService {
	private double balance = 12200;

	public void withdrawAmount(double amount) throws Exception {
		try {
			if (amount <= 0) {
				throw new Exception("Withdraw amount must be greater than 0.");
			}

			if (amount > balance) {
				throw new IllegalArgumentException("Insufficient Balance");
			}
			balance -= amount;
			System.out.println("Withdra Successfully");
			System.out.println("Remaining Balance : " + balance);
		} finally {
			System.out.println("Closing ATM connection...");
		}
	}
}
