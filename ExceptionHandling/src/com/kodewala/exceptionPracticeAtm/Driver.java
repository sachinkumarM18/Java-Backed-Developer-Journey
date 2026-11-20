package com.kodewala.exceptionPracticeAtm;

public class Driver {

	public static void main(String[] args) throws Exception {
		AtmService atm = new AtmService();
		try {
			//atm.withdrawAmount(500);
			System.out.println("----------------");
			atm.withdrawAmount(45550);
		}catch (IllegalArgumentException e) {
			 System.out.println("Transaction Failed : " + e.getMessage());
			}
		finally {
			System.out.println("Thank you for using Atm machine");
		}
	}

}
