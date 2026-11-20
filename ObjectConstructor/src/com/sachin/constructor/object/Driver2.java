package com.sachin.constructor.object;

class OrderSystem {
	private String orderId;
	private String customerName;
	private String productName;
	private int quantity;
	private double pricePerItem;
	private double totalAmount;
	private String orderStatus;

	// Static variable
	private static int counter = 5000;

	// 1. Default Constructor

	public OrderSystem() {
		this("Guest");
		System.out.println("Default Constructor");
	}

	// 2. One Parameter Constructor

	public OrderSystem(String customerName) {
		this(customerName, "Unknown Product");
		System.out.println("Customer Constructor");
	}

	// 3. Two Parameter Constructor
	public OrderSystem(String customerName, String productName) {
		this(customerName, productName, 1, 0.0);
		System.out.println("Customer + Product Constructor");
	}

	// 4. Main Constructor
	public OrderSystem(String customerName, String productName, int quantity, double pricePerItem) {

		counter++;
		this.orderId = "ORD" + counter;

		this.customerName = customerName;
		this.productName = productName;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;

		this.totalAmount = quantity * pricePerItem;

		if (totalAmount >= 50000) {
			orderStatus = "Premium Order";
		} else if (totalAmount >= 10000) {
			orderStatus = "Priority Order";
		} else {
			orderStatus = "Normal Order";
		}

		System.out.println("Main Constructor");
	}

	public void display() {
		System.out.println("Order ID : " + orderId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Product Name : " + productName);
		System.out.println("Quantity : " + quantity);
		System.out.println("Price Per Item : " + pricePerItem);
		System.out.println("Oder Status : " + orderStatus);

	}
}

public class Driver2 {

	public static void main(String[] args) {
		OrderSystem order = new OrderSystem();
		OrderSystem order1 = new OrderSystem("Sachin");
		OrderSystem order2 = new OrderSystem("Rahul", "Keyboard");
		OrderSystem order3 = new OrderSystem("Amit", "Laptop", 2, 500000);
		
		order.display();
		order1.display();
		order2.display();
		order3.display();
	}

}
