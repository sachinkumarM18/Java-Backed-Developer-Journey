package com.sachin.constructor.object;

class Order {
	private String orderId;
	private String customerName;
	private String productName;
	private int quantity;
	private double pricePerItem;
	private double totalAmount;

	private static int counter = 1000;

	// 1. Default constructor
	Order() {
		this("Guest");
		System.out.println("Default Constructor");
	}

	// 2. One Parameter Constructor
	public Order(String customerName) {
		this(customerName, "Unknown Product");
		System.out.println("Customer Constructor Completed");
	}

	// 3. Two Parameter Constructor
	public Order(String customerName, String productName) {
		this(customerName, productName, 1);
		System.out.println("Customer + Product Constructor");
	}

	// 4. Three Three Parameter Constructor
	public Order(String customerName, String productName, int quantity) {
		this(customerName, productName, quantity, 0.0);
		System.out.println("Quantity Constructor Completed");
	}

	// 5. Main Constructor
	public Order(String customerName, String productName, int quantity, double pricePerItem) {
		counter++;
		this.orderId = "ORD" + counter;
		this.customerName = customerName;
		this.productName = productName;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
		this.totalAmount = totalAmount;

		System.out.println("Main Constructor Execute");
	}

	public void display() {
		System.out.println("\n---------------------------");
		System.out.println("Order Id      : " + orderId);
		System.out.println("Customer      : " + customerName);
		System.out.println("Product       : " + productName);
		System.out.println("Quantity      : " + quantity);
		System.out.println("Price         : " + pricePerItem);
		System.out.println("Total Amount  : " + totalAmount);
		System.out.println("---------------------------");
	}
}

public class Driver4 {

	public static void main(String[] args) {
		Order order = new Order();
		Order order1 = new Order();
		order.display();
	}

}
