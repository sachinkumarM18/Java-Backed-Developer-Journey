
package com.xmlbeanCreation.service;

public class InventryService {

	private int availableStock;

	public boolean checkAvailability(int quantity) {

		System.out.println("\n--- INVENTORY VERIFICATION ---");

		System.out.println("Available Stock: " + availableStock);
		System.out.println("Requested Quantity: " + quantity);

		if (quantity > 0 && availableStock >= quantity) {

			System.out.println("Stock Available!");
			return true;

		} else {

			System.out.println("Insufficient Stock!");
			return false;
		}
	}

	public int getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}
}
