package com.kodewala.abstra.Interface;

public class Driver {

	public static void main(String[] args) {
		
		Ordermanagemant avail = new Availability();
		
		avail.checkAvailability();
		avail.confirmOrder();
		avail.placeOrder();
		avail.shippedOrder();
		avail.editOrder();
		
		Ordermanagemant sub = new ConfirmOrder();
		
		sub.checkAvailability();
		sub.confirmOrder();
		sub.placeOrder();
		sub.editOrder();
		sub.shippedOrder();
		
		Ordermanagemant  pal = new PlacedOrder();
		pal.checkAvailability();
		pal.confirmOrder();
		pal.placeOrder();
		pal.shippedOrder();
		pal.editOrder();
	}
	

}
