package com.mini_ecommerce_jdbc.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.model.Product;

public class ProductTestModel {
 
	@Test
	void shouldCreateProductAndReturnValues() {

		Product product = new Product(101, "Laptop", "Electronics", 55000, 10, "Dell");

		assertEquals(101, product.getProductId());
		assertEquals("Laptop", product.getProductName());
		assertEquals("Electronics", product.getCategory());
		assertEquals(55000, product.getPrice());
		assertEquals(10, product.getStockQuantity());
		assertEquals("Dell", product.getBrand()); 
	}

	@Test
	void shouldReturnProductString() {

		Product product = new Product(101, "Laptop", "Electronics", 55000, 10, "Dell");

		String result = product.toString();

		assertEquals(
				"Product [productId=101, productName=Laptop, category=Electronics, price=55000, stockQuantity=10, brand=Dell]",
				result);
	}
}