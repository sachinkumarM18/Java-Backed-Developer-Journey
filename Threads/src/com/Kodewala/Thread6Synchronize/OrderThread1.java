package com.Kodewala.Thread6Synchronize;

public class OrderThread1 extends Thread {

	private Product product;

	public OrderThread1(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		Product.reserveProduct(product, 8);
	}
}
