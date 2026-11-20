package com.kodewala.collectionsUtility;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver2 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cities = new CopyOnWriteArrayList<String>();
		cities.add("BLR");
		cities.add("HYD");
		cities.add("Patna");
		cities.add("Chennai");
		cities.add("Chappra");
		cities.add("Siwan");

		Iterator<String> itr = cities.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			// System.out.println(element);
			// the removing element at the index 3rd // Modify the collections
			if (element.equalsIgnoreCase("Chennai")) {
				System.out.println("Driver2.main() removing .........");
				cities.remove(4);
			}
		}
		System.out.println(cities);
	}
}
