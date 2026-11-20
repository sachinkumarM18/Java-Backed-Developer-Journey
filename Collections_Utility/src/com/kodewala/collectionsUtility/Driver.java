package com.kodewala.collectionsUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>();
		cities.add("BLR");
		cities.add("HYD");
		cities.add("Patna");
		cities.add("Chennai");
		cities.add("Chappra");
		cities.add("Siwan");

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(105);
		numbers.add(10);
		numbers.add(120);
		numbers.add(100);
		numbers.add(15);
		Collections.sort(numbers);

//		System.out.println(cities);
//		Collections.sort(cities);
//		System.out.println(cities);

		List<String> unList = Collections.unmodifiableList(cities);
		// Trying to Modify it
//		 unList.add("lucknow");
//		 System.out.println(unList);
//		Collections.synchronizedList(cities);
//		System.out.println(cities);
//
//		Collections.reverse(cities);
//		System.out.println(cities);

		Iterator<String> itr = cities.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
			// Removing the element at index 3rd 
			// Modify the collections
			//cities.remove(3);
		}
		System.out.println(cities);
		System.out.println(numbers);
	}

}
