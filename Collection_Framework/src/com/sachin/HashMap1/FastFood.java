package com.sachin.HashMap1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class FastFood {

	public static void main(String[] args) {
		Map<Integer, String> products = new HashMap<Integer, String>(); // o/p - Store in Currly Bracket
		products.put(101, "Pizza");
		products.put(105, "Burger");
		products.put(106, "Coldrinks");
		products.put(110, "Momo");
		products.put(111, "Banana");
		products.put(111, "Banana");

		// System.out.println(products);
		Set<Entry<Integer, String>> adding = products.entrySet(); // o/p - Store in Square Bracket

		Iterator<Entry<Integer, String>> itr = adding.iterator();
		// System.out.println(itr);
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			// System.out.println(entry);
			System.out.println("Key : " + entry.getKey()

					+ " Value : " + entry.getValue());
		}
		System.out.println("=======================");
//
		LinkedHashMap<Integer, String> items = new LinkedHashMap<Integer, String>();
		items.put(201, "Gulab Jamun");
		items.put(210, "Snacks");
		items.put(111, "Paneer");
		items.put(221, "Milk");

		Set<Entry<Integer, String>> fastFood = items.entrySet();
		Iterator<Entry<Integer, String>> itr1 = fastFood.iterator();
		while (itr1.hasNext()) {
			Entry<Integer, String> entry = itr1.next();
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

		System.out.println("=======================");

		TreeMap<Integer, String> languages = new TreeMap<Integer, String>();
		languages.put(001, "Java");
		languages.put(111, "Python");
		languages.put(561, "C++");
		languages.put(102, "JavaScript");
		languages.put(151, "Angular");
		languages.put(102, "JavaScript");

//		Set<Entry<Integer, String>> entrySet = languages.entrySet();
//		Iterator<Entry<Integer, String>> itr2 = entrySet.iterator();
//		while (itr2.hasNext()) {
//			Entry<Integer, String> entry = itr2.next();
//			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
//		}

		for (Entry<Integer, String> entry : languages.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}
}