package com.kodewala.exception1;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Main Method Start");

		// String name = null; // This may be null
		String name = args[0]; // Array index out of Bound
		System.out.println("Length of String : " + name.length());
		
		int amount = 100;
		int result = amount / 0;
		
		System.out.println(result);

		Driver driver = new Driver();
		driver.doSomethings();

		System.out.println("Main Method end");
	}

	private void doSomethings() {
		System.out.println("Start");
		System.out.println("Driver is Doing SOmethings");
		System.out.println("End");
	}
}
