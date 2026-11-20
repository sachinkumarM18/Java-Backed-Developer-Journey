package com.kodewala.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureNormalMethod {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// RunAsync
//		CompletableFuture<Void> notification = CompletableFuture.runAsync(() -> {
//			System.out.println("Notification Sent by " + Thread.currentThread().getName());
//		});
//		notification.join();

		// SupplyAsync
		CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
			// System.out.println(Thread.currentThread().getName());
			return 20;

			// Then Apply
		}).thenApplyAsync((n) -> {
			// System.out.println(Thread.currentThread().getName());
			return n * 5;
		});

		// System.out.println(cf1);
		// getCustomer.join();

		// supplyAsync
		CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
			// System.out.println(Thread.currentThread().getName());
			return 30;
			// thenApply
		}).thenApplyAsync((n) -> {
			// System.out.println(Thread.currentThread().getName());
			return n * 10;
		});

		// Final data with combination
		CompletableFuture<Integer> finalCF = cf2.thenCombineAsync(cf1, (a, b) -> a + b);
		// System.out.println(finalCF.join());

		CompletableFuture<String> Customer = CompletableFuture.supplyAsync(() -> {
			return "Customer : Sachin";
		});
		// System.out.println(Customer.join());

		// thenAcccept
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			return "Order #101";
		});

//		future.thenAccept(order -> {
//			System.out.println("Order received: " + order);
//		});

		// thenRun
//		future.thenRun(() -> {
//			System.out.println("Order Processing Completed..");
//		});
//		future.join();
//
//		// Then Compose
//		CompletableFuture<String> customer = CompletableFuture.supplyAsync(() -> {
//			return "Customer-101";
//		});
//
//		CompletableFuture<String> order = customer.thenCompose(customerId -> {
//
//			return CompletableFuture.supplyAsync(() -> {
//				return customerId + " -> Order-5001";
//			});
//
//		});
//
//		System.out.println(order.join());

		// ALL OFF
//		CompletableFuture<String> customer = CompletableFuture.supplyAsync(() -> {
//			return "Customer Loaded";
//		});
//
//		CompletableFuture<String> product = CompletableFuture.supplyAsync(() -> {
//			return " Order Loaded";
//		});
//
//		CompletableFuture<String> payment = CompletableFuture.supplyAsync(() -> {
//			return "Payment Loaded ";
//		});
//
//		CompletableFuture<Void> allTask = CompletableFuture.allOf(customer, product, payment);
//		allTask.thenRun(() -> {
//			System.out.println("ALl Task has Been Completed");
//		}).join();

		// AnyOf
		CompletableFuture<String> serverA = CompletableFuture.supplyAsync(() -> {
			sleep(3000);
			return "Message from Server A";
		});

		CompletableFuture<String> serverB = CompletableFuture.supplyAsync(() -> {
			sleep(1000);
			return "Message From Server B";
		});

		CompletableFuture<Object> result = CompletableFuture.anyOf(serverA, serverB);
		System.out.println(result.join());
	}

	static void sleep(long miliseconds) {
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
