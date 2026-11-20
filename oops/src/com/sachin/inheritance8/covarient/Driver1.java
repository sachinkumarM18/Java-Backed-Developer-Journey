package com.sachin.inheritance8.covarient;

class Product{
	Product getProduct() {
		return new Product();
	}
}
class Laptop extends Product{
	@Override
	Laptop getProduct() {
		return new Laptop();
	}
	
	void insatallSoftware() {
		System.out.println("Installing Software....");
	}
}


public class Driver1 {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		//laptop.getProduct();
		Laptop result = laptop.getProduct();
		result.insatallSoftware();
		
	}

}
