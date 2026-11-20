package com.kodewala.ecommerce.order.management;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calling Static Method
		IOrderService.connectDatabse();
		System.out.println();
		
		// Regular User
		IOrderService regular = new RegularOrderService();
		
		regular.placeOrder();
		regular.trackOrder();
		//regular.printInvoice();
		regular.cancelOrder();
		
		System.out.println();
		
		// Prime User
		
		IOrderService prime = new PrimeOrderService();
		
		prime.placeOrder();
		prime.trackOrder();
		prime.printInvoice();
		prime.cancelOrder();
	}

}
