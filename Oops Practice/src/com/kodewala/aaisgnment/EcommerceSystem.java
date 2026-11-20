package com.kodewala.aaisgnment;

public class EcommerceSystem {
	public static void main(String[] args) {
		
		OrderSystem retail = new RetailUser();
		
		retail.placeOrder();
		retail.editOrder();
		retail.confirmOrder();
		retail.getOrderStatus();
		
		OrderSystem premium = new PremiumUser();
		
		premium.placeOrder();
		premium.editOrder();
		premium.confirmOrder();
		premium.getOrderStatus();
		
		
		
		OrderSystem reseller = new Reseller();
		
		reseller.placeOrder();
		reseller.editOrder();
		reseller.confirmOrder();
		reseller.getOrderStatus();
	}
}
