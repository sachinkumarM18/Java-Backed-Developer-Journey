package com.sachin.Abstract.Classses2.OrderManagement;

public class OrderDriver {

	public static void main(String[] args) {
		Retails retail = new Retails();
		retail.confirmOrder();
		retail.editOrder();
		retail.placeOrder();
		retail.orderStatus();

		System.out.println("    ======================    ");

		Resellers reseller = new Resellers();
		reseller.confirmOrder();
		reseller.editOrder();
		reseller.orderStatus();
		reseller.placeOrder();

		System.out.println("    ======================    ");

		Premium premium = new Premium();
		premium.confirmOrder();
		premium.editOrder();
		premium.orderStatus();
		premium.placeOrder();
	}

}
