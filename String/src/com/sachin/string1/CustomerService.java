package com.sachin.string1;

public class CustomerService {

	public static void main(String[] args) {
		String customerName = "Akash";
		customerName = updateName(customerName);
		System.out.println(customerName);
	}

	static String updateName(String customerName) {
		return "Vikash";
	}
}
 