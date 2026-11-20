package com.sachin.inheritance6.castingupdown;

class Product {
	private String name;
	private String desc;

	public int displayProductDetails() {
		System.out.println("This is generic Product...");
		return 30;
	}
}

class ElectronicProducts extends Product {
	private String size;
	private String color;

	@Override
	public int displayProductDetails() {
		System.out.println("This is Electronics Products..");
		return 20;
	}
}

public class Driver1 {

	public static void main(String[] args) {

		Object obj = ObjectFactory.getObject("ElectronicProducts");
		Product p =  (Product) obj;
		p.displayProductDetails();
	}

}
