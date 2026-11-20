// Transaction Id Generator

package com.kodewala.date28.interf6;

import java.util.UUID;
import java.util.function.Supplier;

public class Driver1 {

	public static void main(String[] args) {
		Supplier<String> transactionIdSupplier = () -> UUID.randomUUID().toString();
		System.out.println(transactionIdSupplier.get());
	}
}
