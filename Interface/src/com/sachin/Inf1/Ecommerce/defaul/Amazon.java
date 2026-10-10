package com.sachin.Inf1.Ecommerce.defaul;

public class Amazon implements DeliveryService {

	@Override
	public void pickupOrder() {
		System.out.println("Amazon : Order Pickup");
	}

	@Override
	public void packOrder() {
		System.out.println("Amazon : Order Pack");
	}

	@Override
	public void shipOrder() {
		System.out.println("Amazon : Order Shipped");
	}

	@Override
	public void trackOrder() {
		System.out.println("Amazon : Track Your Order");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Amazon : Cancel Order");
	}

  private void syso() {
	// TODO Auto-generated method stub
	  

}      
}
