package com.sachin.arraylist.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Order {

	public static void main(String[] args) {
		/*
		 * List<String> orderIds = new ArrayList<>(); orderIds.add("ORD101");
		 * orderIds.add("ORD102"); orderIds.add("ORD103"); orderIds.add("ORD104");
		 * orderIds.add("ORD105"); orderIds.add("ORD106");
		 * 
		 * if (orderIds.contains("ORD101")) { System.out.println("Ordered Found"); }
		 */

		List<String> languages = new ArrayList<>();
		languages.add("java");
		languages.add("Python");
		languages.add("Sql");
		languages.add("C++");
		languages.add("Spring Boot");
		languages.add("Docker");
		languages.add("java");

//		if(languages.contains("React")) {
//			System.out.println("It is Available");
//		}else {
//			System.out.println("It's Not Available");
//		}
		System.out.println("Last Java index: " + languages.lastIndexOf("java"));
		System.out.println("First Java index: " + languages.indexOf("java"));
		System.out.println("C++ index: " + languages.indexOf("C++"));
		System.out.println(languages.size());
	}

}
