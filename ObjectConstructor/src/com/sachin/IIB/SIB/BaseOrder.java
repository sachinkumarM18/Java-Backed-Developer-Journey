package com.sachin.IIB.SIB;

class BaseOrder {
	protected String orderId;

	// Static Counter
	protected static int objectCount = 0;

	// SIB
	static {
		System.out.println("1. BaseOrder SIB");
		System.out.println("Loading Database Configuration...");
	}

	// IIB
	{
		System.out.println("4. BaseOrder IIB");
	}

	// Parent Constructor
	BaseOrder() {
		objectCount++;
		System.out.println("5. BaseOrder Constructor ");
	}

	public void displayOrderType() {
		System.out.println("Order Type : Base Order");
	}

	public static void displayObjectCount() {
		System.out.println();
		System.out.println("Total Objects Created : " + objectCount);
	}
}
