package com.sachin.collection.set.Problem2;

import java.util.Objects;

public class ProductManagement implements Comparable<ProductManagement> {

	private String productId;
	private String productName;
	private String category;
	private double price;
	private String status;

	public ProductManagement(String productId, String productName, String category, double price, String status) {

		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.status = status;
	}

	// -----------------------------------------
	// Getter
	// -----------------------------------------

	public String getProductId() {
		return productId;
	}

	public double getPrice() {
		return price;
	}

	// -----------------------------------------
	// equals()
	// Product uniqueness = productId
	// -----------------------------------------

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		ProductManagement other = (ProductManagement) obj;

		return Objects.equals(productId, other.productId);
	}

	// -----------------------------------------
	// hashCode()
	// Same field used as equals()
	// -----------------------------------------

	@Override
	public int hashCode() {

		return Objects.hash(productId);
	}

	// -----------------------------------------
	// compareTo()
	// First sort by price
	// If price same → sort by productId
	// -----------------------------------------

	@Override
	public int compareTo(ProductManagement other) {

		int result = Double.compare(this.price, other.price);

		if (result != 0) {
			return result;
		}

		return this.productId.compareTo(other.productId); 
	}

	// -----------------------------------------
	// toString()
	// -----------------------------------------

	@Override
	public String toString() {

		return "ProductManagement [" + "ProductId=" + productId + ", ProductName=" + productName + ", Category="
				+ category + ", Price=" + price + ", Status=" + status + "]";
	}
}