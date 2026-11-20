package com.kodewala.exception6ProblemOrder;

class EcomerceOrder {
	public void placeOrder(String item, int qty) {

		try {
			if (qty <= 0) {
				throw new IllegalArgumentException("Quantity must be greater than 0.");
			} else {
				System.out.println("Order placed successfully.");
				System.out.println("Item : " + item);
				System.out.println("Quantity : " + qty);
			}

		} catch (IllegalArgumentException e) {
			System.out.println("Order Failed : " + e.getMessage());
		} finally {
			System.out.println("Thank You for visiting Ecommerce Website");
		}
	}
}
