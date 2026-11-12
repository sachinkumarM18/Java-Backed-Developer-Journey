package com.sachin.Linkedlist.collection;

import java.util.LinkedList;

public class List4 {

	public static void main(String[] args) {
		LinkedList<String> orders = new LinkedList<>();

		orders.add("ORD101");
		orders.add("ORD102");
		orders.add("ORD103");
		orders.add("ORD104");
		orders.add("ORD105");

		String cancelOrder = "ORD103";
		if(orders.contains(cancelOrder)) {
			orders.remove(cancelOrder);
			System.out.println("Order deleted Successfully");
		}else {
			System.out.println("Cancel order is not present");
		}
		System.out.println(orders);
		
//		System.out.println("Remaining Order is : " + orders);
//		System.out.println("Total Orders: " + orders.size());
	}

}
