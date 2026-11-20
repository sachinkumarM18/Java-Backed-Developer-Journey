package com.kodewala.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class Exceptions {

	public static void main(String[] args) {
//		CompletableFuture<String> payment = CompletableFuture.<String>supplyAsync(() -> {
//			throw new RuntimeException("Payment Failed");
//		}).exceptionally(exception -> {
//			System.out.println("Error : " + exception.getMessage());
//			return "Payment Failed";
//		});
//
//		System.out.println(payment.join());

		CompletableFuture<String> payment = CompletableFuture.supplyAsync(() -> {
			return "Payment Successfull";
		}).handle((result, exception) -> {
			if (exception != null) {
				System.out.println("Error : " + exception.getMessage());
				return "Payment Failed";
			}
			return result;
		});

		System.out.println(payment.join());
	}

}
