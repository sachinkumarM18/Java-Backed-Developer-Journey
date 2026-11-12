package com.sachin.Linkedlist.collection.set.LinkedHash;

import java.util.LinkedHashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		Set<String> cities = new LinkedHashSet<String>();
		cities.add("BLR");
		cities.add("GGN");
		cities.add("DL");
		cities.add("HYD");
		cities.add("CHE");
		cities.add("BLR");

		System.out.println(cities);
	}

}
