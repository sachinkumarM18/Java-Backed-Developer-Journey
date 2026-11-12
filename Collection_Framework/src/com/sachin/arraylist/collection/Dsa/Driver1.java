package com.sachin.arraylist.collection.Dsa;

import java.util.ArrayList;

public class Driver1 {

	public static void main(String[] args) {
		// Find duplicate Integer from the array

		/*
		 * ArrayList<Integer> numbers = new ArrayList<Integer>(); numbers.add(101);
		 * numbers.add(205); numbers.add(310); numbers.add(101); numbers.add(450);
		 * numbers.add(205); numbers.add(520);
		 * 
		 * for (int i = 0; i < numbers.size(); i++) { int currentNumber =
		 * numbers.get(i); for (int j = i + 1; j < numbers.size(); j++) { if
		 * (currentNumber == numbers.get(j)) { System.out.println("Duplicate : " +
		 * currentNumber); break; } } }
		 */

		/*
		 * // Find Name from the Employee Details ArrayList<String> employees = new
		 * ArrayList<>();
		 * 
		 * employees.add("Sachin"); employees.add("Rahul"); employees.add("Akash");
		 * employees.add("Sachin"); employees.add("Priya"); employees.add("Rahul");
		 * employees.add("Amit");
		 * 
		 * for(int i = 0; i < employees.size(); i++) { String currentName =
		 * employees.get(i); for(int j = i + 1; j < employees.size(); j++) {
		 * if(currentName.equals(employees.get(j))) { System.out.println("Duplicate : "
		 * + currentName); break; } } }
		 */

		ArrayList<String> employees = new ArrayList<>();

		employees.add("Sachin");
		employees.add("Rahul");
		employees.add("Sachin");
		employees.add("Akash");
		employees.add("Rahul");
		employees.add("Sachin");
		employees.add("Amit");
		

		for (int i = 0; i < employees.size(); i++) {
			String currentName = employees.get(i);
			int count = 0;
			for (int j = 0; j < employees.size(); j++) {
				if (currentName.equals(employees.get(j))) {
					count++;

				}
			}
			System.out.println(currentName + " → " + count + " times");
		}

	}

}
