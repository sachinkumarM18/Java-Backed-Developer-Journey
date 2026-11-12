package com.sachin.Linkedlist.collection;

import java.util.LinkedList;

public class Linkedlist2 {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(120);
		numbers.add(18);
		numbers.add(31);

		LinkedList<Integer> result = new LinkedList<Integer>();

		for (Integer number : numbers) {
			if (number > 10) {
				result.add(number);
			}
		}
		System.out.println(result);
	}

}
