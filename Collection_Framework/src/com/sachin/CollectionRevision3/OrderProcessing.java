package com.sachin.CollectionRevision3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OrderProcessing {

	public static void main(String[] args) {
		Map<Integer, String> orders = new HashMap<Integer, String>();
		orders.put(1001, "PLACED");
		orders.put(1002, "SHIPPED");
		orders.put(1003, "CANCELLED");
		orders.put(1004, "PLACED");
		orders.put(1005, "CANCELLED");
		orders.put(1006, "SHIPPED");

		int placedCount = 0;
		int shippedCount = 0;
		int cancelledCount = 0;
		System.out.println("Orders Details");

		for (Map.Entry<Integer, String> entry : orders.entrySet()) {
			int orderId = entry.getKey();
			String status = entry.getValue();

			System.out.println("Order Id : " + orderId + " | Status : " + status);

			if (status.equals("PLACED")) {
				placedCount++;

				// update the value of the current Entry
				entry.setValue("PROCESSING");
			} else if (status.equals("SHIPPED")) {

				shippedCount++;
			} else if (status.equals("CANCELLED")) {

				cancelledCount++;
			}
		}

		System.out.println("\n-------After Processing--------");
		for (Map.Entry<Integer, String> entry : orders.entrySet()) {
			System.out.println("Order Id : " + entry.getKey() + " | Status: " + entry.getValue());
		}

		// Removing Cancelled Order
		System.out.println("\nRemoving Cancelled Order");

		Iterator<Map.Entry<Integer, String>> iterator = orders.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();

			int orderId = entry.getKey();
			String status = entry.getValue();

			if (status.equals("CANCELLED")) {
				iterator.remove();
				System.out.println("Removed Order Id : " + orderId);
			}
		}

		// final Orders

		System.out.println("=======Final Orders========");
		for (Map.Entry<Integer, String> entry : orders.entrySet()) {
			System.out.println("Order Id : " + entry.getKey() + " | Status : " + entry.getValue());
		}

		System.out.println("\n ---- Summary------");
		System.out.println("Placed Count : " + placedCount);
		System.out.println("Shipped Count : " + shippedCount);
		System.out.println("Cancelled Count : " + cancelledCount);

		System.out.println("Remaining Orders : " + orders.size());
	}
}
