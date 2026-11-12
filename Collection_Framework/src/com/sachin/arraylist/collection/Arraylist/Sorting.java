package com.sachin.arraylist.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(50);
		numbers.add(10);
		numbers.add(40);
		numbers.add(20);
		numbers.add(30);

//		System.out.println("Before Sorting : " + numbers);
//		numbers.sort(null);
//		System.out.println("After Sorting : " + numbers);
		
		numbers.sort((a, b) -> b.compareTo(a));
		System.out.println("After Sorting : " + numbers);

		/*
		 * // This is for String List<String> languages = new ArrayList<>();
		 * languages.add("Python"); languages.add("Java"); languages.add("Docker");
		 * languages.add("C++");
		 * 
		 * System.out.println("Before Sorting the Language : " + languages);
		 * languages.sort(null); System.out.println("After Sorting the Language : " +
		 * languages);
		 */
	}

}
