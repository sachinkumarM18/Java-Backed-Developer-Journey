package com.kodewala.exception1;

public class Driver1 {

	public static void main(String[] args) {
		System.out.println("Driver Start from Here");

		try {
			String name = null;
			System.out.println("Driver main length : " + name.length());

		} catch (NullPointerException e) {
			System.out.println("Exception :  Name is Null");
		}

		System.out.println("Driver End");
	}

}
