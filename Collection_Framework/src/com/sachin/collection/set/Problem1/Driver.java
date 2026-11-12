package com.sachin.collection.set.Problem1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Driver {

	public static void main(String[] args) {
		LinkedHashSet<ProductManagement> products = new LinkedHashSet<ProductManagement>();
		products.add(new ProductManagement("P104", "iPhone 17", "Mobile", 120000, "Available"));
		products.add(new ProductManagement("P101", "Mac Book", "Laptop", 150000, "Out of Stock"));
		products.add(new ProductManagement("P105", "LED Tv", "TV", 12000, "Available"));
		products.add(new ProductManagement("P102", "Led Bulb", "Electricity", 120, "Available"));
		products.add(new ProductManagement("P103", "Pizza", "Fastfood", 200, "Out Of Stock"));

		LinkedHashSet<ProductManagement> productList = new LinkedHashSet<ProductManagement>();
		productList.addAll(products);

		Iterator<ProductManagement> itr = productList.iterator();
		while (itr.hasNext()) {
			ProductManagement product = itr.next();
			System.out.println(product.toString());
		}
	}

}
