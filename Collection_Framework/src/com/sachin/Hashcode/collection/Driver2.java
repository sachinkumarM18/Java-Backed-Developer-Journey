package com.sachin.Hashcode.collection;

import java.util.HashSet;

public class Driver2 {

	public static void main(String[] args) {
		HashSet<String> products = new HashSet<String>();
		products.add("ggaa");
		products.add("dsklb");
		products.add("ggac");
		products.add("dskld");
		products.add("ggae");
		products.add("dsklf");
		products.add("gga");
		products.add("dsklg");
		products.add("ggah");
		products.add("dskli");
		products.add("ggaj");
		products.add("dsklk");
		products.add("ggal");
		products.add("dsklm");
		products.add("ggan");
		products.add("dsklo");

		int hash = "dskld".hashCode();
		int spreadHash = hash ^ (hash >>> 16);
		int bucketNumber = spreadHash & 15;
		System.out.println("Bucket Number : " + bucketNumber);
		System.out.println(products);
	}

}
