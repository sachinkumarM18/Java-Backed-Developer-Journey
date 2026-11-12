package com.sachin.collection.set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		Set<String> cities = new TreeSet<String>();
		cities.add("BLR");
		cities.add("GGN");
		cities.add("DL");
		cities.add("HYD");
		cities.add("CHE");
		cities.add("BLR");
		cities.add("AMD");

		System.out.println(cities);
	}

}
