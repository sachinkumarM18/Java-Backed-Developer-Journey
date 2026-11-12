package com.sachin.collection.set.TreeSet2;


import java.util.TreeSet;

public class Driver1 {

	public static void main(String[] args) {
		TreeSet<Integer> prices = new TreeSet<Integer>();
		prices.add(100);
		prices.add(120);
		prices.add(1050);
		prices.add(420);
		prices.add(500);
		prices.add(520);

		System.out.println("Price : " + prices);
		System.out.println("Lowest :" + prices.first());
		System.out.println("High : " + prices.last());
		System.out.println("Lower 500 : " + prices.lower(500));
		System.out.println("Lower 500 : " + prices.higher(500));
		System.out.println("Floor: " + prices.floor(420));
		System.out.println("Ceilling : " + prices.ceiling(120));
	}

}
