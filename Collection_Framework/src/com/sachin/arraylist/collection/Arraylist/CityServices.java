package com.sachin.arraylist.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

class CityServices {
	public static void main(String[] args) {

		
//		ArrayList<String> products = new ArrayList<String>();
//		products.add("Laptop");
//		products.add("mouse");
//		products.add("Keyboard");
//		products.add("Monitor");
//
//		products.add(2, "Headphone");
//
//		for (String product : products) {
//			System.out.println(product);
//		}
//
//		boolean result = products.add("Speaker");
//		System.out.println(result);

	
		
		List<String> products = new ArrayList<>();
		products.add("Laptop");
		products.add("mouse");
		products.add("Keyboard");
		products.add("Monitor");

		products.add(2, "Headphone");
		
		for (String product : products) {
			System.out.println(product);
		}
	}

}
