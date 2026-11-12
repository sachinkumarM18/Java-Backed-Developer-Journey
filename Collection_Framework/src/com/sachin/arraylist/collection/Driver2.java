package com.sachin.arraylist.collection;

import java.util.ArrayList;

public class Driver2 {

	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<>();
		studentNames.add("Sachin");
		studentNames.add("Abhay");
		studentNames.add("Rohit");
		studentNames.add("Anshu");
		studentNames.add("Roshni");
		studentNames.add("Rahul");
		studentNames.add(4, "Shradha");

		studentNames.add(2, "Jatin");
		System.out.println(studentNames);
		studentNames.remove(5);

		// System.out.println(studentNames);

		for (String string : studentNames) {
			System.out.println(string);
		}

		studentNames.remove(String.valueOf("Sachin"));
		System.out.println(studentNames);
		
		// studentNames.remove(3);
//		studentNames.add(2, "Neha");
//		studentNames.remove(String.valueOf("Rahul"));
//		System.out.println(studentNames);
//		System.out.println(studentNames.getFirst());

//		for (int index = 0; index < studentNames.size(); index++) {
//			String name = name = studentNames.get(index);
//			if (name.startsWith("S")) {
//				System.out.println(name);
//			}
//		} 

	}
}
