package com.sachin.problem.inhri.home;

class Electronics extends Product {
	private String brand;
	private int warrantyYears;

	public Electronics(int productId, String productName, double price, String brand, int warrantyYears) {
		super(productId, productName, price);
		// TODO Auto-generated constructor stub
		this.brand = brand;
		this.warrantyYears = warrantyYears;

	}

	@Override
	public double calculateDiscount() {
		if (price > 50000) {
			return price - (price * 0.10);
		}
		return price;

	}

	@Override
	void displayDetails() {
		super.displayDetails();

		System.out.println("Brand        : " + brand);
		System.out.println("Warranty     : " + warrantyYears + " Years");
		System.out.println("Final Price  : ₹" + calculateDiscount());
	}

}
