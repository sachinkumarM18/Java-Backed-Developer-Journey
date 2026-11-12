package com.sachin.Linkedlist.collection;

import java.util.LinkedList;

public class List3 {

	public static void main(String[] args) {
		LinkedList<String> lanhuages = new LinkedList<String>();
		lanhuages.add("Java");
		lanhuages.add("Python");
		lanhuages.add("Java");
		lanhuages.add("SQL");
		lanhuages.add("Python");
		lanhuages.add("Java");

		int count = 0;
		for (String language : lanhuages) {
			if (language.equals("Java")) {

				count++;
			}
		}
		System.out.println("Java = " + count);
	}

}
