package com.sachin.string1;

public class Productservice {

	public static void main(String[] args) {
		String sku = "Laptop";
		sku = generateSku(sku);
		System.out.println(sku);
	}

	static String generateSku(String sku) {
		return sku.concat("-2002");
	}
}

/*
public class ProductService {

    public static void main(String[] args) {

        String sku = "Laptop";

        sku = generateSku(sku);

        System.out.println(sku);
    }

    static String generateSku(String sku) {

        return sku.concat("-2002");

    }

}*/