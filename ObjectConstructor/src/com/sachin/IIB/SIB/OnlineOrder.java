package com.sachin.IIB.SIB;

public class OnlineOrder extends BaseOrder {

	private String customerName;
	private String productName;
	private int quantity;
	private double price;

	// Child SIB
	static {
		System.out.println("2. OnlineOrder SIB");
		System.out.println("Loading Payment Gateway...");
	}

	// Child IIB
	{
		System.out.println("6. OnlineOrder IIB");
	}

	// Default Constructor
	public OnlineOrder() {
		this("Guest");
		System.out.println("10. Default Constructor");
	}

	// One Parameter Constructor
	public OnlineOrder(String customerName) {
		this(customerName, "Unknown Product");
		System.out.println("9. Customer Constructor");
	}

	// Two Parameter Constructor
	public OnlineOrder(String customerName, String productName) {
		this(customerName, productName, 1, 0);
		System.out.println("8. Customer + Product Constructor");
	}

	// Main Constructor
	public OnlineOrder(String customerName, String productName, int quantity, double price) {

		super();

		this.customerName = customerName;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;

		this.orderId = "ORD" + objectCount;

		System.out.println("7. Main Constructor");
	}

	public void display() {

		System.out.println();
		System.out.println("------------ ORDER ------------");
		System.out.println("Order Id      : " + orderId);
		System.out.println("Customer      : " + customerName);
		System.out.println("Product       : " + productName);
		System.out.println("Quantity      : " + quantity);
		System.out.println("Price         : " + price);
	}

	public static void main(String[] args) {

		OnlineOrder order1 = new OnlineOrder();

		order1.displayOrderType();

		order1.display();

		OnlineOrder order2 = new OnlineOrder("Sachin", "Laptop", 2, 50000);

		order2.display();

		BaseOrder.displayObjectCount();
	}
}
