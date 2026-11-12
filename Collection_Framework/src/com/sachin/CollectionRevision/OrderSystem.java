package com.sachin.CollectionRevision;

import java.util.ArrayList;

public class OrderSystem {

	public static void main(String[] args) {
		ArrayList<String> orders = new ArrayList<String>();
		orders.add("laptop");
		orders.add("mobile");
		orders.add("Mouse");
		orders.add("headPhone");
		orders.add("Keybord");
		orders.add("Mouse");
		orders.add("headPhone");
		orders.add(0, "Speaker");
		System.out.println(orders);
	}

}
