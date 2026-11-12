package com.sachin.collection.set.TreeSet;

import java.util.TreeSet;

class Product implements Comparable<Product> {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

//   @Override
//	public int compareTo(Product o) {
//		return this.id - o.id;
//		// Integer.compare(this.id, o.id);
//	}

//	@Override
//	public int compareTo(Product o) {
//		return this.name.compareTo(o.name);
//	}

	@Override
	public int compareTo(Product o) {
		return Double.compare(this.price, o.price);
	}

	public String toString() {
		return id + " - " + name;
	}
}

public class Driver3 {
	public static void main(String[] args) {
		TreeSet<Product> products = new TreeSet<Product>();
		products.add(new Product(131, "Laptop", 60000));
		products.add(new Product(110, "Mouse", 1000));
		products.add(new Product(120, "Keyboard", 2500));

		System.out.println(products);
	}

}
