package com.ThreadPractice;

public class Driver extends Thread {
	public void addTwoNumbers(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	@Override
	public void run() {
		addTwoNumbers(15, 10);
	}

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.start();
	}

}
