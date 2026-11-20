package com.Kodewala.Thread6Synchronize;

public class Product {
	private final int productId;
	private final String productName;
	private int stock;

	public Product(int productId, String productName, int stock) {
		this.productId = productId;
		this.productName = productName;
		this.stock = stock;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getStock() {
		return stock;
	}

	public static void reserveProduct(Product product, int quantity) {
		synchronized (product) {
			System.out.println(
					"[" + Thread.currentThread().getName() + "] Checking Product for : " + product.productName);
			if (product.stock >= quantity) {
				System.out.println("[" + Thread.currentThread().getName() + "] Available Stock : " + product.stock);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}

				product.stock = product.stock - quantity;
				System.out.println("[" + Thread.currentThread().getName() + "] Reserved : " + quantity);

				System.out.println("[" + Thread.currentThread().getName() + "] Remaining Stock : " + product.stock);
			} else {
				System.out.println("[" + Thread.currentThread().getName() + "] Insuffiecient Stock");
			}
		}
	}
}
