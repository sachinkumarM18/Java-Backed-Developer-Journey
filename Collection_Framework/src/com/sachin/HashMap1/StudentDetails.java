package com.sachin.HashMap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentDetails {

	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(111, "Sachin");
		students.put(101, "Prevez");
		students.put(141, "Nitin");
		students.put(123, "Jatin");
		students.put(131, "Rohit");

		System.out.println(students);
		Set<Entry<Integer, String>> adding = students.entrySet();
		Iterator<Entry<Integer, String>> itr = adding.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

}
