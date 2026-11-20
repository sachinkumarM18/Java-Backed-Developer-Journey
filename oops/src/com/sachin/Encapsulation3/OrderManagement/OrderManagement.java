package com.sachin.Encapsulation3.OrderManagement;

public class OrderManagement {

	public static void main(String[] args) {

		Order order = new Order("ORD101", "Sachin", "Laptop", 2, 50000);

		System.out.println("Order ID: " + order.getOrderId());

		System.out.println("Customer: " + order.getCustomerName());

		System.out.println("Product: " + order.getProductName());

		System.out.println("Quantity: " + order.getQuantity());

		System.out.println("Price: " + order.getPrice());

		System.out.println("Total: " + order.getTotalAmount());

		// Increase quantity

		order.increaseQuantity(2);

		System.out.println("Quantity after increase: " + order.getQuantity());

		// Decrease quantity

		order.decreaseQuantity(1);

		System.out.println("Quantity after decrease: " + order.getQuantity());

		// Final total

		System.out.println("Final Total: " + order.getTotalAmount());
	}
}