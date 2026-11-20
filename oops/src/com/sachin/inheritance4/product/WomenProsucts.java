package com.sachin.inheritance4.product;

class WomensProduct extends ClothingProduct {

	private String styleType;

	public WomensProduct(int productId, String productName, double price, String size, String material, String brand,
			String styleType) {

		super(productId, productName, price, size, material, brand);

		this.styleType = styleType;
	}

	public void displayWomensProduct() {
		displayClothingDetails();

		System.out.println("Style Type    : " + styleType);
	}
}