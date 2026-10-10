package com.sachin.Interface.Lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		// Predicate
		Predicate<Integer> isAdult = age -> age >= 18;
		System.out.println("Adult : " + isAdult.test(25));

		// Consumer
		Consumer<String> printName = name -> System.out.println("Employee: " + name);
		printName.accept("Rohit");

		// Supplier
		Supplier<String> companyName = () -> "ABC Technology";
		System.out.println("Company : " + companyName.get());
	}

}
