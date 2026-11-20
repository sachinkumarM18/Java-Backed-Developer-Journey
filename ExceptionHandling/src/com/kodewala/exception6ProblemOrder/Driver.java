package com.kodewala.exception6ProblemOrder;

public class Driver {

	public static void main(String[] args) {
		EcomerceOrder order = new EcomerceOrder();

		try {
			order.placeOrder("Iphone", 5);
			//order.placeOrder("Laptop", -2);
		} catch (Exception e) {
			System.out.println("Order Failed : " + e.getMessage());
		}
	}

}
