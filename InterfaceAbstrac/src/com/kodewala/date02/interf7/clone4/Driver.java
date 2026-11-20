package com.kodewala.date02.interf7.clone4;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Invoice originalInvoice = new Invoice("INV-2026-101", "Sachin Kumar", 45000, "Pending");
		Invoice clonedInvoice = originalInvoice.clone();
		
		clonedInvoice.setPaymentStatus("Paid");
		clonedInvoice.setTotalAmount(47000);
		
		System.out.println("Original Invoice");
		originalInvoice.displayInvoice();
		
		System.out.println();
		
		System.out.println("Cloned Invoice");
		clonedInvoice.displayInvoice();		
	}
}
