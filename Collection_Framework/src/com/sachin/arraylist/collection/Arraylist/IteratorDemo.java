package com.sachin.arraylist.collection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {

		List<String> employees = new ArrayList<>();

		employees.add("EMP101");
		employees.add("EMP102");
		employees.add("EMP103");
		employees.add("EMP104");

		Iterator<String> iterator = employees.iterator();

		while (iterator.hasNext()) {

			String employee = iterator.next();

			System.out.println(employee);
		}
	}
}
