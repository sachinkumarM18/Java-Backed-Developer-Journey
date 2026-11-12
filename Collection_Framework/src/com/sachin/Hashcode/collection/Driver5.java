package com.sachin.Hashcode.collection;

import java.util.HashSet;

public class Driver5 {

	public static void main(String[] args) {
		HashSet<String> products = new HashSet<String>();
		addProduct(products, "Bat");
		addProduct(products, "Ball");
		addProduct(products, "Glubs");
		addProduct(products, "Wicket");
		addProduct(products, "Bat");

		for (String products1 : products) {
			System.out.println(products1);
		}
		// System.out.println("All Products : " + products);

		System.out.println(products.contains("Bat"));
	}

	static void addProduct(HashSet<String> products, String productName) {
		// Addd Product into Hashset
		boolean added = products.add(productName);

		// Check Whether product was added
		if (added) {
			int hash = productName.hashCode();
			int spreadHash = hash ^ (hash >>> 16);
			int bucketNumber = spreadHash & 15;

			System.out.println("Product : " + productName);
			System.out.println("Hash : " + hash);
			System.out.println("Spread Hash : " + spreadHash);
			System.out.println("Bucket Number : " + bucketNumber);
			System.out.println("Status : Product Added");
		} else {
			System.out.println("Product : " + productName);
			System.out.println("Status : Duplicate Product");
		}
		System.out.println("================");
	}

}
