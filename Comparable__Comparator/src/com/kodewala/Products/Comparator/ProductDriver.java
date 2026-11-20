package com.kodewala.Products.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDriver {

	public static void main(String[] args) {
		Product product1 = new Product(111, "Pizza", 99, 4);
		Product product2 = new Product(101, "Burger", 199, 3);
		Product product3 = new Product(120, "Momo", 89, 3);
		Product product4 = new Product(251, "Coldrinks", 249, 3);
		Product product5 = new Product(20, "Milk", 89, 4);

		List<Product> products = new ArrayList<Product>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);

		Collections.sort(products, new ProductIdComparator());
		for (int i = 0; i < products.size(); i++) {
			Product p = products.get(i);
			System.out.println(p.id + " , " + p.name + " , " + p.price + " , " + p.rating);
		}
	}

}
