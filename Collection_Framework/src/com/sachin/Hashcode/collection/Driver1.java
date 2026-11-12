package com.sachin.Hashcode.collection;

import java.util.HashSet;

public class Driver1 {
	
	public static void main(String[] args) {
		HashSet<String> product = new HashSet<String>();
		product.add("iPhone17");
		product.add("samsung");
		product.add("lg32");
		product.add("mac-pro324");

		int hash = "samsung".hashCode();
		int spreadHash = hash ^ (hash >>> 16);
		int bucketNumber = spreadHash & 15;
		System.out.println("Bucket Number : " + bucketNumber);
	}
}
