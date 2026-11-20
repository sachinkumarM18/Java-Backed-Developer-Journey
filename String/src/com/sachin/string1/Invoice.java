package com.sachin.string1;

public class Invoice {

	public static void main(String[] args) {
		String invoice = "";

		for (int i = 1; i <= 100; i++) {
			invoice = invoice + "product" + i + "\n";
		}
		System.out.println(invoice);
	}

}
