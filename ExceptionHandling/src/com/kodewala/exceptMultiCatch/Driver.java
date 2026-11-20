package com.kodewala.exceptMultiCatch;

public class Driver {

	public static void main(String[] args) {
		try {
			int[] numbers = { 10, 20, 30 };
			System.out.println(numbers[5]);
			int result = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Array Index");
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by Zero");
		} catch (Exception e) {
			System.out.println("Unknown Exception");
		} finally {
			System.out.println("Application Closed");
		}
	}

}
