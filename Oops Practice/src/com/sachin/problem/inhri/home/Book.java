package com.sachin.problem.inhri.home;

public class Book extends Product {
	private String author;
	private String genre;

	public Book(int productId, String productName, double price, String author, String genre) {
		super(productId, productName, price);
		// TODO Auto-generated constructor stub
		this.author = author;
		this.genre = genre;
	}

	@Override

	double calculateDiscount() {
		return price - (price * 0.05);
	}

	@Override
	void displayDetails() {
		super.displayDetails();

		System.out.println("Author       : " + author);
		System.out.println("Genre        : " + genre);
		System.out.println("Final Price  : ₹" + calculateDiscount());
	}
}
