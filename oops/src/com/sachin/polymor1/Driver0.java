package com.sachin.polymor1;

class Calculator {
	public int add(int a, int b) {
		System.out.println("Adding Two Nunber");
		return a + b;
	}
}

class Cal extends Calculator {
	public int add(int a, int b, int c) {
		System.out.println("Adding Three Nunber");
		return a + b + c;
	}
}

public class Driver0 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(5, 10));
		

		Cal cal1 = new Cal();
		System.out.println(cal1.add(10, 20, 30));
		System.out.println(cal.add(10, 20));
	}
 
}
