package com.sachin.abstractClass3.OrderProcess;

public class BankSystem {

	public static void main(String[] args) {

		OrderProcessor saving = new SavingOrderProcessor("ORD-101", 5000);

		saving.showOrderDetails();

		System.out.println("----------------");

		saving.processOrder();

		System.out.println("----------------");

		saving.showOrderDetails();

		System.out.println("\n====================\n");

		OrderProcessor current = new CurrentOrderProcessor("ORD-102", 3000);

		current.processOrder();

		current.showOrderDetails();
	}
}
