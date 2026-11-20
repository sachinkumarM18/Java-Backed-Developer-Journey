package com.kodewala.Synchronized;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Driver2 {

	public static void main(String[] args) throws InterruptedException {
		// Normal HashMap
		Map<String, Integer> inventry = new HashMap<String, Integer>();
		inventry.put("Oppo Reno", 20);
		inventry.put("Asus", 15);
		inventry.put("Mac Book", 14);
		inventry.put("Motorola", 20);
		inventry.put("One plus", 60);

		// Make HashMap Thread Safe
		Map<String, Integer> synchronizedInventry = Collections.synchronizedMap(inventry);

		// Task executed by multiple threads

		Runnable purchaseTask = () -> {
			for (int i = 0; i < 5; i++) {
				synchronized (synchronizedInventry) {
					Integer stock = synchronizedInventry.get("Motorola");
					if (stock > 0) {
						synchronizedInventry.put("Motorola", stock - 1);
						System.out.println(Thread.currentThread().getName() + "purchased Motorola Edge20"
								+ "| Remaining Stock : " + (stock - 1));
					} else {
						System.out.println(Thread.currentThread().getName() + " | Motorola Edge20 Out of Stuck");
					}
				}
			}
		};

		// Multiple users / requests

		Thread user1 = new Thread(purchaseTask, "User-1");
		Thread user2 = new Thread(purchaseTask, "User-2");
		Thread user3 = new Thread(purchaseTask, "User-3");
		Thread user4 = new Thread(purchaseTask, "User-4");
		Thread user5 = new Thread(purchaseTask, "User-5");

		// Start threads
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();

		// Wait for all threads

		user1.join();
		user2.join();
		user3.join();
		user4.join();
		user5.join();

		// Safe iteration
		synchronized (synchronizedInventry) {

			System.out.println("\nFinal Inventory:");

			for (Map.Entry<String, Integer> entry : synchronizedInventry.entrySet()) {

				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
		}

	}

}
