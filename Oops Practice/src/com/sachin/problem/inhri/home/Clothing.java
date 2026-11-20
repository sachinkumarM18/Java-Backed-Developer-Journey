package com.sachin.problem.inhri.home;

public class Clothing extends Product {

	private String size;
	private String color;

	public Clothing(int productId, String productName, double price, String size, String color) {
		super(productId, productName, price);
		// TODO Auto-generated constructor stub
		this.size = size;
		this.color = color;
	}

	@Override
	public double calculateDiscount() {
		if (price > 2000) {
			return price - (price * 0.20);
		}
		return price;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();

		System.out.println("Size         : " + size);
		System.out.println("Color        : " + color);
		System.out.println("Final Price  : ₹" + calculateDiscount());
	}

}
