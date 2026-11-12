package com.sachin.Hashcode.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {
		HashSet<String> language = new HashSet<String>();
		language.add("Java");
		language.add("Python");
		language.add("C");
		language.add("C++");
		language.add("C#");
		language.add("SQL");
		language.add("JavaScript");
		// language.add("Java");

//		for (String lang : language) {
//			System.out.println(lang);
//		}

		Iterator<String> itr = language.iterator();
		while (itr.hasNext()) {
			String lang = itr.next();

			if (lang.startsWith("Java")) {
				itr.remove();
			}
		}
		System.out.println(language);
	} 

}
