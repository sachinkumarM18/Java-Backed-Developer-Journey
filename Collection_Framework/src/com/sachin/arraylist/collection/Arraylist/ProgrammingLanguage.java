package com.sachin.arraylist.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguage {

	public static void main(String[] args) {
		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Python");
		languages.add("SQL");
		languages.add("JavaScript");
		languages.add("C");

		List<String> newLanguage = new ArrayList<String>();
		newLanguage.add("Kotlin");
		newLanguage.add("flutter");
		languages.addAll(newLanguage);
		System.out.println(languages);
		languages.set(2, "C++");
		System.out.println(languages);

		languages.remove(4);
		languages.remove("Kotlin");

		System.out.println(languages);
		System.out.println(languages.contains("Python"));

		
	}

}
