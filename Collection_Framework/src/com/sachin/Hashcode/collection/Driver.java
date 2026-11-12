package com.sachin.Hashcode.collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Driver {
	public static void main(String args[]) {
		LinkedHashSet<String> electronicsItems = new LinkedHashSet<String>();
		electronicsItems.add("Laptop");
		electronicsItems.add("Smartphone");
		electronicsItems.add("Smartwatch");
		electronicsItems.add("Smartphone");
		electronicsItems.add("TV");
		electronicsItems.add(null);
		electronicsItems.add(null);

		System.out.println("ELectronics Items are : ");

		for (String items : electronicsItems) {
			System.out.println(items);
		}
		electronicsItems.add("Laptop");

		int hash = "Tv".hashCode();
		int spreadHash = hash ^ (hash >>> 16);
		int bucket = spreadHash & (16 - 1);

		System.out.println("Bucket is : " + bucket);
		System.out.println(hash);

//		// Checking the content of LinkedHashSet
//
//		System.out.println("\nDoes the set Contains 'Laptop'? :" + electronicsItems.contains("Laptop"));
//		// Removing an element
//		electronicsItems.remove("Smartwatch");
//		System.out.println("\nAfter Removing Smartwatch");
//
//		for (String items : electronicsItems) {
//			System.out.println(items);
//		}
	}
}
