package com.sachin.inheritance4.product;

class MensProduct extends ClothingProduct {

	private String fitType;

	public MensProduct(int productId, String productName, double price, String size, String material, String brand,
			String fitType) {

		super(productId, productName, price, size, material, brand);

		this.fitType = fitType;
	}

	public void displayMensProduct() {
		displayClothingDetails();

		System.out.println("Fit Type     : " + fitType);
	}
}
