package com.sachin.collection.set.TreeSet2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Product implements Comparable<Product> {
	String productId;
	String productName;
	double price;
	String status;

	public Product(String productId, String productName, double price, String status) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.status = status;
	}

	@Override
	public int compareTo(Product o) {
		int result = Double.compare(this.price, o.price);
		return result;
	}

	@Override
	public String toString() {
		return "Product [ProductId = " + productId + ", Name = " + productName + ", Price = " + price + ", Status = "
				+ status + "]";
	}

	@Override
	public int hashCode() {
		return this.productId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productId, other.productId);
	}

}

public class Driver2 {

	public static void main(String[] args) {
		Set<Product> products = new HashSet<Product>();
		products.add(new Product("PR101", "Spects", 2000, "Available"));
		products.add(new Product("PR110", "Comb", 20, "OutofStock"));
		products.add(new Product("PR100", "Water Bottle", 25, "OutofStock"));
		products.add(new Product("PR120", "Chips", 30, "OutofStock"));
		products.add(new Product("PR116", "Comb", 20, "Available"));
		products.add(new Product("PR106", "Notes", 70, "Available"));
		products.add(new Product("PR110", "Comb", 200, "OutofStock"));

		TreeSet<Product> productList = new TreeSet<Product>();
		productList.addAll(products);

		Iterator<Product> itr = productList.iterator();
		while (itr.hasNext()) {

			Product product = itr.next();

			System.out.println(product.toString());
		}
	}

}
