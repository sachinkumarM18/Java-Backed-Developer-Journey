package com.sachin.Interface.Lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver4 {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (a) -> a < 1000;
		System.out.println(predicate.test(50));
		System.out.println(predicate.test(5000));

		Supplier<String> supplier = () -> "Bangalore";
		System.out.println(supplier.get());

		Supplier<Integer> supplier2 = () -> 100000 + new Random().nextInt(9000000);
		System.out.println("Your Otp is : " + supplier2.get());

		Consumer<String> consumer = (emailTo) -> System.out.println("Email has been sent : " + emailTo);
		consumer.accept("sachin@001gmail.com");

		Function<Integer, Integer> function = (amt) -> amt - (amt * 5 / 100);
		System.out.println(function.apply(500)); 
	}

}
