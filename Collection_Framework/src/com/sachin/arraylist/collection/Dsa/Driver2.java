package com.sachin.arraylist.collection.Dsa;

import java.util.ArrayList;

public class Driver2 {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();

		students.add("Sachin");
		students.add("Himanshu");
		students.add("Sonu");
		students.add("Krishu");
		students.add("Kriti");
		students.add("Apple");

		for (int i = 0; i < students.size(); i++) {
			String currentStudent = students.get(i);
			int count = 0;
			for (int j = 0; j < students.size(); j++) {
				
				if (currentStudent.equals(students.get(j))) {
					count++;
				}
				
			}
			System.out.println(currentStudent + " → " + count + " times");
		}

		/*
		 * // For each loop for print the all data for(String student : students) {
		 * System.out.println(student); }
		 */
	}

}
