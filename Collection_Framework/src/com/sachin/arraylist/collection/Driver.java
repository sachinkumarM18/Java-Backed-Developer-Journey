package com.sachin.arraylist.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// i want to store String object (Employee name )
		// 1. Create a collection object (Creating container which will store the
		// employee name)

		ArrayList<String> employeeNames = new ArrayList<String>();

		// 2. Add an elements (employeeNames)

		employeeNames.add("Sachin");
		employeeNames.add("Viaksh");
		employeeNames.add("Akash");
		employeeNames.add("Abhi");
		employeeNames.add("Sachin");
		employeeNames.add("Rajat");
		employeeNames.add("Abhishek");
		employeeNames.add("Bravo");
		employeeNames.add("Rohit");
//		
//		for(int index =0; index < employeeNames.size(); index++) {
//			String name = employeeNames.get(index);
//			System.out.println(name);
//		}

//		for (int index = 0; index < employeeNames.size(); index++) {
//			String name = employeeNames.get(index);
//			if (name.startsWith("S")) {
//				System.out.println(name);
//			}
//		}

		System.out.println("----------------------------------");

		// for each loop
//		for (String name : employeeNames) {
//			System.out.println(name);
//		}

		ArrayList<String> collegeName = new ArrayList<String>();
		collegeName.add(0, "GCT");
		collegeName.add(1, "SRM");
		collegeName.add(2, "LPU");
		collegeName.add("BHU");

		// System.out.println(collegeName);
		System.out.println("Index of index 3 : " + collegeName.get(3));

		for (String string : collegeName) {
			System.out.println(string);
		}
	}

}
