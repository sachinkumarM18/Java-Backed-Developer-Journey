package com.beanScope.bean;

public class Delivery {
	private String orderId;
	private String productName;

	public Delivery(String orderId, String productName) {
		super();
		this.orderId = orderId;
		this.productName = productName;
	}

	public void displayDelivery() {
		String data = "Delivery [orderId=" + orderId + ", productName=" + productName + "]";
		System.out.println(data);
	}

}
