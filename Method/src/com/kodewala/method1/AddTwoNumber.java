package com.kodewala.method1;

public class AddTwoNumber {

	public static void main(String[] args) {
		String input1 = args[0];
		String input2 = args[1];

		int fir = Integer.parseInt(input1);
		int sec = Integer.parseInt(input2);

		AddTwoNumber.addNumber(fir, sec);
	}

	static int addNumber(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		return sum;
	}
}
