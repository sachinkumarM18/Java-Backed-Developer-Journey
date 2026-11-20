package com.kodewala.exceptionInternetBank;

class BankingSystem {
	public void login(String customerId, String password, String otp) throws Exception {
		try {
			if (customerId == null) {
				throw new Exception("CustomerId Can't be Null");
			}
			if (password == null) {
				throw new Exception("Password Can't be null");
			}
			if (password.length() < 7) {
				throw new Exception("Password must be greater than 7");
			}
			if (otp == null) {
				throw new Exception("Otp can't be Null");
			}
			System.out.println("Employee Login Successfully");
		} finally {
			System.out.println("Closing Banking Session...");
		}
	}
}
