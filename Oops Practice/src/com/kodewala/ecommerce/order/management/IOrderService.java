package com.kodewala.ecommerce.order.management;

public interface IOrderService {
	
	// Abstract Method
	void placeOrder();
	void cancelOrder();
	void trackOrder();
	
	// Default Method (java 8)
	default void printInvoice() {
		System.out.println("invoice Generated Successfully");
	}
	
	// Static Method (java 8)
	static void connectDatabse() {
		System.out.println("Database Connected Successfully");
	}
}
