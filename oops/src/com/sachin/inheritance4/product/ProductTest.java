package com.sachin.inheritance4.product;

public class ProductTest {

	public static void main(String[] args) {

		MensProduct menProduct = new MensProduct(101, "Formal Shirt", 1499, "L", "Cotton", "Peter England", "Slim Fit");

		WomensProduct womenProduct = new WomensProduct(201, "Summer Dress", 1999, "M", "Rayon", "Biba", "A-Line");

		System.out.println("----- MEN'S PRODUCT -----");
		menProduct.displayMensProduct();

		System.out.println();

		System.out.println("----- WOMEN'S PRODUCT -----");
		womenProduct.displayWomensProduct();
	}
}
