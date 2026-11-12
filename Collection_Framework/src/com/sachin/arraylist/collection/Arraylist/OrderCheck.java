package com.sachin.arraylist.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class OrderCheck {

	public static void main(String[] args) {
		List<String> orders = new ArrayList<>();
		orders.add("EMP0022");
		orders.add("ORD101");
		orders.add("ORD102");
		orders.add("ORD103");

		System.out.println(orders);
		orders.clear();
		System.out.println(orders);
		System.out.println(orders.isEmpty());
 	}

}
