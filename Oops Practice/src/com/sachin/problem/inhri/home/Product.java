package com.sachin.problem.inhri.home;

class Product {
	protected int productId;
	protected String productName;
	protected double price;
	
	public Product(int productId, String productName , double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	 void acceptDetails() {
		System.out.println();
	}
	
	 void displayDetails() {
		System.out.println("-------------");
		System.out.println("Product ID :" + productId);
		System.out.println("Product Name :" + productName);
		System.out.println("Price :" + price);
	}
	
	  double calculateDiscount() {
		return price;
	}
}
