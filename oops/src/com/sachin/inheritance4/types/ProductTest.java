
// MiltiLevel Inheritance

package com.sachin.inheritance4.types;

class Product {
	String productName;
	double price;

	void showProduct() {
		System.out.println("Product Name : " + productName);
		System.out.println("Product Price : " + price);
	}
}

class Electronics extends Product {
	String brand;

	void showBrand() {
		System.out.println("Brand Name : " + brand);
	}
}

class Mobile extends Electronics {
	String model;

	void showModel() {
		System.out.println("Model Name : " + model);
	}
}

public class ProductTest {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.productName = "Samsung";
		mobile.brand = "Samsung";
		mobile.model = "Samsung f26 Ultra";
		mobile.price = 129999;

		mobile.showProduct();
		mobile.showBrand();
		mobile.showModel();
	}

}
