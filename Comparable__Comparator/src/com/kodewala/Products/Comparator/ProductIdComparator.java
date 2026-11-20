package com.kodewala.Products.Comparator;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		int result = Double.compare(p2.rating, p1.rating);
		int result1 = Double.compare(p1.price, p2.price);

		if (result == 0) {
			return result1;
		}
		return result;
	}

//	@Override
//	public int compare(Product p1, Product p2) {
//		int result = Integer.compare(p1.id, p2.id);
//		return result;
//	}

}
