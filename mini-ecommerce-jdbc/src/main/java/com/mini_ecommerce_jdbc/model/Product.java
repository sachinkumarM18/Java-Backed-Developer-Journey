package com.mini_ecommerce_jdbc.model;

public class Product {
	private int productId;
	private String productName;
	private String category;
	private int price;
	private int stockQuantity;
	private String brand;

	public Product(int productId, String productName, String category, int price, int stockQuantity, String brand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.brand = brand;
	}

	public int getProductId() { 
		return productId;
	}
 
	public String getProductName() { 
		return productName;
	} 

	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public String getBrand() { 
		return brand;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + ", stockQuantity=" + stockQuantity + ", brand=" + brand + "]";
	}

}
