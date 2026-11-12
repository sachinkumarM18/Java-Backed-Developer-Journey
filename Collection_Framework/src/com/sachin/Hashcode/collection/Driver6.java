package com.sachin.Hashcode.collection;

import java.util.HashSet;

public class Driver6 {

	static void addProducts(HashSet<String> products, String productName) {
		boolean added = products.add(productName);
		if (added) {
			int hash = productName.hashCode();
			int spreadHash = hash ^ (hash >>> 16);
			int bucketNumber = spreadHash & 15;

			System.out.println("Product Name : " + productName);
			System.out.println("Product Hash : " + hash);
			System.out.println("Spread Hash : " + spreadHash);
			System.out.println("Bucket Number : " + bucketNumber);
			System.out.println("Producted Added : Successfully");

			System.out.println("===================");
		}
	}

	public static void main(String[] args) {
		HashSet<String> products = new HashSet<String>();
		addProducts(products, "Jaeans");
		addProducts(products, "Tshirt");
		addProducts(products, "Lower");
		addProducts(products, "Cargo");
		addProducts(products, "Joggers");
//
//		for (String product : products) {
//			System.out.println(product);
//		}

		System.out.println(products);
	}

}
