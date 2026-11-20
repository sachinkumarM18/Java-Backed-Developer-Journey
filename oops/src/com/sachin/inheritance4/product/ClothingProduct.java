package com.sachin.inheritance4.product;

class ClothingProduct extends Product {
	private String size;
	private String material;
	private String brand;

	public ClothingProduct(int productId, String productname, double price, String size, String material,
			String brand) {

		super(productId, productname, price);
		this.size = size;
		this.material = material;
		this.brand = brand;
	}

	public void displayClothingDetails() {
		displayProduct();

		System.out.println("Size         : " + size);
		System.out.println("Material     : " + material);
		System.out.println("Brand        : " + brand);
	}

}
