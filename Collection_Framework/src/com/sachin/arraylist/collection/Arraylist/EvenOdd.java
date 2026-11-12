package com.sachin.arraylist.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);

		System.out.println("Before removing even numbers: " + numbers);
		numbers.removeIf(number -> number % 2 == 0);
		System.out.println("After removing even numbers: " + numbers);
	}
}
