package com.sachin.Encapsulation3.OrderManagement;

public class Order {
	private String orderId;
	private String customerName;
	private String productName;
	private int quantity;
	private double price;

	public Order(String orderId, String customerName, String productName, int quantity, double price) {

		this.orderId = orderId;
		this.customerName = customerName;
		this.productName = productName;
//		this.quantity = quantity;
//		this.price = price;

		if (quantity <= 0) {
			System.out.println("Quantity must be greater than zero");
		} else {
			this.quantity = quantity;
		}

		if (price < 0) {
			System.out.println("Price cannot be negative");
		} else {
			this.price = price;
		}

	}
	// Increase Quantity

	public void increaseQuantity(int quantity) {

		if (quantity <= 0) {
			System.out.println("Quantity must be greater than zero");
		} else {
			this.quantity += quantity;
		}
	}

	// Decrease Quantity

	public void decreaseQuantity(int quantity) {

		if (quantity <= 0) {
			System.out.println("Quantity must be greater than zero");
		} else if (quantity > this.quantity) {
			System.out.println("Cannot decrease more than current quantity");
		} else {
			this.quantity -= quantity;
		}
	}

	// Calculate Total Amount

	public double getTotalAmount() {
		return quantity * price;
	}

	// Getters

	public String getOrderId() {
		return orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

}
