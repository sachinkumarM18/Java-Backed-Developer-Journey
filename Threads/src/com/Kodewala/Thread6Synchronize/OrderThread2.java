package com.Kodewala.Thread6Synchronize;

public class OrderThread2 extends Thread {
	private Product product;

	public OrderThread2(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		Product.reserveProduct(product, 5);
	}
}
