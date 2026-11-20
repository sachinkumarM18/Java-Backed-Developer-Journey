package com.Kodewala.Thread6Synchronize;

public class inventoryDemo {

	public static void main(String[] args) throws InterruptedException {
		Product product = new Product(101, "iPhone", 15);

		OrderThread1 t1 = new OrderThread1(product);
		OrderThread2 t2 = new OrderThread2(product);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Stock : " + product.getStock());
	}

}
