package com.sachin.HashMap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class OrderSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> orders = new HashMap<Integer, String>();

		System.out.println("Enter number of Orders : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Order Id : ");
			int orderId = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Customer Name : ");
			String customerName = sc.nextLine();

			orders.put(orderId, customerName);
		}
		System.out.println("\n========== ORDERS ==========");

		Set<Entry<Integer, String>> entrySet = orders.entrySet();
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("Order ID : " + entry.getKey() + " | Customer : " + entry.getValue());
		}
	}

}
