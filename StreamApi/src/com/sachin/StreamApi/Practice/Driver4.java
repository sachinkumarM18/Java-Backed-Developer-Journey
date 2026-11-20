package com.sachin.StreamApi.Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Driver4 {

	public static void main(String[] args) {

		// To find second greatest Element
//
//		List<Integer> salaries = Arrays.asList(55000, 12000000,72000, 68000, 51000, 95000, 63000, 80000, 57500, 110000, 69000,
//				92000, 68000, 78000, 52000, 85000, 48000, 45000, 50000);
//		Integer output = salaries.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst().orElse(0);
//		System.out.println(output);

		List<String> names = Arrays.asList("Sachin", "Rahul", "Amit", "Priya", "Neha", "Vikas", "Amit", "Anjali",
				"Rohit", "Priya", "Sneha", "Karan", "Rahul", "Amit", "Suresh", "Pooja", "Arjun", "Neha", "Rohit",
				"Priya");
		Set<String> details = new HashSet<String>();
		List<String> out=names.stream().filter(name -> !details.add(name)).toList();
		System.out.println("Duplicate Elements From the List : " + out); 
	}

}
