package com.kodewala.date27.interf4;

public class Amazon implements IOrderSystem {

	@Override
	public void palceOrder() {
		System.out.println("Amazon! Congratulations Your Order has been Confirm");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Your Order has been Cancel");
	}

	@Override
	public void trackOrder() {
		System.out.println("Track your order");
	}

}
