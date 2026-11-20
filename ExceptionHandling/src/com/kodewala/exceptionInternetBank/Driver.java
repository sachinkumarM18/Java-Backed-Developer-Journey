package com.kodewala.exceptionInternetBank;

public class Driver {

	public static void main(String[] args) {
		BankingSystem bank = new BankingSystem();

		try {
			bank.login("22cs131", "Sachin@001", null);
		} catch (Exception e) {
			System.out.println("Login failed : " + e.getMessage());
		} finally {
			System.out.println("Application Closed");
		}
	}

}
