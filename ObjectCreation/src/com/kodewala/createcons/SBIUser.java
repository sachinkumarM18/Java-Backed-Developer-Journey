package com.kodewala.createcons;

public class SBIUser {
	// variable (instance variable)
	private String name;
	private String userId;
	private String pwd;
	private int balance;

//	SBIUser(){
//		System.out.println("This is my first Object Creation");
//	}

	/* This all line is Constructor */
	SBIUser(String _name, String _userId, String _pwd, int _balance) { // Local variable
		System.out.println("SBIUser.SBIUser()");
		this.name = _name;
		this.userId = _userId;
		this.pwd = _pwd;
		this.balance = _balance;
	}

	// Method
	public static void main(String[] args) {
		System.out.println("Start");
		// create an object of SBIUser class
		SBIUser sachin = new SBIUser("Sachin", "sachin001", "sachin@123", 5000); // Calling no args constructor of
																					// SBIUser class
		SBIUser abhi = new SBIUser("Abhi", "abhi@34", "23432@#", 50000);
		// type ref name = new object created for class SBIUser
		System.out.println("End");
	}

}
