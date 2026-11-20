package com.kodewala.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class Driver {

	public static void main(String[] args) {

		// CF1
		CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			return 20;
			
		// thenApply method
			
		}).thenApplyAsync((n) -> {
			System.out.println(Thread.currentThread().getName());
			return n * 10;
		});

		// CF2
		CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			return 30;
		}).thenApplyAsync((n) -> {
			System.out.println(Thread.currentThread().getName());
			return n * 10;
		});

		// thenCombine Method
		CompletableFuture<Integer> finalCF = cf2.thenCombine(cf1, (a, b) -> a + b);

		System.out.println(finalCF.join());

	}
}
