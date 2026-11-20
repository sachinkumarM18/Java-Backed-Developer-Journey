package com.kodewala.date28.interf6;

import java.util.function.Supplier;

public class Driver4 {

	public static void main(String[] args) {

		Supplier<String> orderIdGenerator = () -> "ORD-" + System.currentTimeMillis();

		String orderId = orderIdGenerator.get();

		System.out.println(orderId);
	}
}