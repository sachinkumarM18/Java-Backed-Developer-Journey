package com.kodewala.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> {
	int productId;
	String productName;

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	@Override
	public int compareTo(Product p) {
		int result = this.productName.compareTo(p.productName);
		return result;
	}

//	@Override
//	public int compareTo(Product p) {
//		int result = Integer.compare(this.productId, p.productId);
//		return result;
//	}

}

public class Driver1 {

	public static void main(String[] args) {

		Product product1 = new Product(111, "Iphone17");
		Product product2 = new Product(101, "Google Pixel");
		Product product3 = new Product(108, "Samsung S24");
		Product product4 = new Product(105, "One Plus");

		List<Product> products = new ArrayList<Product>();

		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);

		// System.out.println(products);
		Collections.sort(products);
		for (int i = 0; i < products.size(); i++) {
			Product p = products.get(i);
			System.out.println(p.productId + " , " + p.productName);
		}
		// System.out.println(products);
	}

}
