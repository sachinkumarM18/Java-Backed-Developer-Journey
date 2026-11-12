package com.sachin.Linkedlist.collection;

import java.util.LinkedList;

public class List6 {

	public static void main(String[] args) {
		LinkedList<String> orders = new LinkedList<>();

		orders.add("ORD101");
		orders.add("ORD102");
		orders.add("ORD101");
		orders.add("ORD103");
		orders.add("ORD102");
		orders.add("ORD104");
		orders.add("ORD101");

		String appear = "ORD101";
		String appear2 = "ORD102";

		int count1 = 0;
		int count2 = 0;

//		for (int i = 0; i < orders.size(); i++) {
//			if (orders.get(i).equals(appear)) {
//				count++;
//			}
//		}

		for (String order : orders) {
			if (order.equals(appear)) {
				count1++;
			}

			if (order.contains(appear2)) {
				count2++;
			}
		}
		System.out.println(appear + " Count: " + count1);
		System.out.println(appear2 + " Count: " + count2);

		int size = orders.size();

		System.out.println("Toatal Order : " + size);

		boolean ispresent = false;
		if (orders.contains("ORD999")) {
			System.out.println("Order Present : " + ispresent);
		} else {
			System.out.println("Order Not Present");
		}
	}

}
