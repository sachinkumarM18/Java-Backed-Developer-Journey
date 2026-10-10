package com.sachin.Abstract.Order2;

public class OrderDriver {

	public static void main(String[] args) {
		Order order = new OnlineOrder("ORD-101");

		order.placeOrder();
		System.out.println("Status : " + order.getOrderStatus());

		System.out.println("------------------------------------");

		order.editOrder();
		System.out.println("Status : " + order.getOrderStatus());

		System.out.println("------------------------------------");

		order.confirmOrder();
		System.out.println("Status : " + order.getOrderStatus());
	}

}
