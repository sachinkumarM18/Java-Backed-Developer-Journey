package com.sachin.collection.set.Problem2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {

		// -----------------------------------------
		// Create Products
		// -----------------------------------------

		ProductManagement p1 = new ProductManagement("P104", "iPhone 17", "Mobile", 120000, "Available");

		ProductManagement p2 = new ProductManagement("P101", "Mac Book", "Laptop", 150000, "Out of Stock");

		ProductManagement p3 = new ProductManagement("P105", "LED TV", "TV", 12000, "Available");

		ProductManagement p4 = new ProductManagement("P102", "LED Bulb", "Electricity", 120, "Available");

		ProductManagement p5 = new ProductManagement("P103", "Pizza", "Fastfood", 200, "Out Of Stock");

		// Same productId as P104
		ProductManagement duplicateProduct = new ProductManagement("P104", "iPhone 17 Pro", "Mobile", 130000,
				"Available");

		// Same price as P5, but different productId
		ProductManagement samePriceProduct = new ProductManagement("P106", "Burger", "Fastfood", 200, "Available");

		// -----------------------------------------
		// 1. HashSet
		// Purpose:
		// Unique products based on productId
		// -----------------------------------------

		Set<ProductManagement> uniqueProducts = new HashSet<>();

		uniqueProducts.add(p1);
		uniqueProducts.add(p2);
		uniqueProducts.add(p3);
		uniqueProducts.add(p4);
		uniqueProducts.add(p5);
		uniqueProducts.add(duplicateProduct);
		uniqueProducts.add(samePriceProduct);

		System.out.println("========== HASHSET ==========");

		for (ProductManagement product : uniqueProducts) {

			System.out.println(product);
		}

		// -----------------------------------------
		// 2. LinkedHashSet
		// Purpose:
		// Maintain insertion order
		// -----------------------------------------

		Set<ProductManagement> insertionOrderProducts = new LinkedHashSet<>();

		insertionOrderProducts.add(p1);
		insertionOrderProducts.add(p2);
		insertionOrderProducts.add(p3);
		insertionOrderProducts.add(p4);
		insertionOrderProducts.add(p5);
		insertionOrderProducts.add(duplicateProduct);
		insertionOrderProducts.add(samePriceProduct);

		System.out.println();
		System.out.println("====== LINKEDHASHSET ======");

		for (ProductManagement product : insertionOrderProducts) {

			System.out.println(product);
		}

		// -----------------------------------------
		// 3. TreeSet
		// Purpose:
		// Sort by price
		// Same price → productId
		// -----------------------------------------

		Set<ProductManagement> priceSortedProducts = new TreeSet<>();

		priceSortedProducts.add(p1);
		priceSortedProducts.add(p2);
		priceSortedProducts.add(p3);
		priceSortedProducts.add(p4);
		priceSortedProducts.add(p5);
		priceSortedProducts.add(duplicateProduct);
		priceSortedProducts.add(samePriceProduct);

		System.out.println();
		System.out.println("========= TREESET =========");

		for (ProductManagement product : priceSortedProducts) {

			System.out.println(product);
		}
	}
}