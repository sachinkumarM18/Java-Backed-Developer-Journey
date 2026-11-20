// Get Any String value Using Supplier

package com.kodewala.date28.interf6;

import java.util.function.Supplier;

public class Driver3 {

	public static void main(String[] args) {
		Supplier<String> company = () -> "Google";
		System.out.println(company.get());
	}

}
