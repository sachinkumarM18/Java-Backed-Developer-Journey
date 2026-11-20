package com.sachin.problem.inhri.home;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] products = { new Electronics(101, "iphone 16", 100000, "Apple", 2),
				new Clothing(102, "Hoodie", 3000, "L", "Black"),
				new Book(105, "Auhtor for the People", 499, "Mrs Sachin", "programming") };

		for (

		Product product : products) {
			product.displayDetails();
			System.out.println("");
		}

	};

};
