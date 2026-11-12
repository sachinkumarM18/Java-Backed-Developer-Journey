package com.sachin.collection.set.Problem1;

import java.util.Objects;

public class ProductManagement implements Comparable<ProductManagement> {
	String productId;
	String productName;
	String category;
	double price;
	String status;

	public ProductManagement(String productId, String productName, String category, double price, String status) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.status = status;
	}

	@Override
	public int hashCode() {
		return this.productId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductManagement other = (ProductManagement) obj;
		return Objects.equals(category, other.category)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName)
				&& Objects.equals(status, other.status);
	}

	@Override
	public int compareTo(ProductManagement o) {
		int result = Double.compare(this.price, o.price);
		return result;
	}

	@Override
	public String toString() {
		return "ProductManagement [ProductId = " + productId + ", ProductName = " + productName + ", Category = "
				+ category + ", Price = " + price + ", Status = " + status + "]";
	}

}
