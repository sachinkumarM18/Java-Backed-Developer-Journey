package com.kodewala.exception6OrderService;

class OrderService {
	private int availableQuantity = 6;

	public void orderPlace(String productName, int productQuantity) {
		try {
			System.out.println("=========== Order Started ============");
			System.out.println("Product Name : " + productName);
			System.out.println("Product Quantity : " + productQuantity);

			if (availableQuantity <= productQuantity) {
				System.out.println("Product is Out of Stock");
			} else {
				System.out.println("Ordered Confirm....");
				availableQuantity -= productQuantity;
				System.out.println("Availabe Item : " + availableQuantity);
			}
		} catch (Exception e) {
			System.out.println("Order Failed.");
			System.out.println("Reason : " + e.getMessage());
		}
		System.out.println("========== Order End ==========\n");
	}
}
