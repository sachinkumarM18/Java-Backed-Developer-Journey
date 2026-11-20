package com.kodewala.date27.interf4;

public class Driver {

	public static void main(String[] args) {
		processOrder(new Amazon());
		System.out.println("<------------->");
		processOrder(new Flipcart());
		System.out.println("<------------->");
		processOrder(new Myntra());
		System.out.println("<------------->");
		processOrder(new Meeso());
	}
	private static void processOrder(IOrderSystem order) {
		order.palceOrder();
		order.cancelOrder();
		order.trackOrder();
		
	}
}
