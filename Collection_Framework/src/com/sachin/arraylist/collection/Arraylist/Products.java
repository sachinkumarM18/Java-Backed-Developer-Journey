package com.sachin.arraylist.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Products {

	public static void main(String[] args) {
		List<String> products = new ArrayList<>();
		products.add("Laptop");
		products.add("Mouse");

		List<String> newProducts = new ArrayList<>();
		newProducts.add("KeyBoard");
		newProducts.add("Monitor");

		products.addAll(newProducts);
		//System.out.println(products);
		
		products.set(2, "Wireless Mouse");
		//System.out.println(products);
		// System.out.println(products);

		String product1 = products.get(3);
		String product2 = products.get(2);
		System.out.println(product1);
		System.out.println(product2);
	}

}
