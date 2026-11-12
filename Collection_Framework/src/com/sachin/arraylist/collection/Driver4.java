package com.sachin.arraylist.collection;

import java.util.ArrayList;

public class Driver4 {

	public static void main(String[] args) {
		ArrayList<String> employees = new ArrayList<>();

		employees.add("Sachin");
		employees.add("Rahul");
		employees.add("Akash");
		employees.add("Sachin");
		employees.add("Priya");
		employees.add("Vikash");
		employees.add("Amit");

		/*
		 * // Find employee whose name starts with "A" for(String employee : employees)
		 * { if(employee.startsWith("A")) { System.out.println(employee); } }
		 */

//		for (String string : employees) {
//			if (string.startsWith("P")) {
//				System.out.println(string);
//			}
//		}

//		for (String string : employees) {
//			if (string.startsWith("A")) {
//				System.out.println(string);
//			}
//		}

//		if(employees.contains("Sachin")) {
//			System.out.println("Sachin is Present");
//		}
//		
	}

}
