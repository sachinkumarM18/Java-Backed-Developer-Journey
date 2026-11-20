package com.mini_ecommerce_jdbc.model;

public class Cart {
	private int cartId;
	private int customerId;
	private int productId;
	private int quantity;

	public Cart(int cartId, int customerId, int productId, int quantity) {

		super();
		this.cartId = cartId;
		this.customerId = customerId;
		this.productId = productId;
		this.quantity = quantity; 
	}

	public Cart(int customerId, int productId, int quantity) {
		this.customerId = customerId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public int getCartId() {
		return cartId;
	}

	public int getCustomerId() {
		return customerId;
	}
 
	public int getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}


	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", customerId=" + customerId + ", productId=" + productId + ", quantity="
				+ quantity + "]";
	}

}
