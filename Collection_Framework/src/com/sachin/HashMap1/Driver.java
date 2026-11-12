package com.sachin.HashMap1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Driver {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Some Keys");

		// System.out.println(set);

		/*
		
		 */
		Map<String, String> map = new HashMap<String, String>();
		map.put("Bihar", "Patna");
		map.put("Bihar", "Patliputra");
		map.put("Karnatka", "BLR");
		map.put("Gujrat", "Gandhi nagar");
		map.put("Punjab", "Chandigarh");
		map.put("Haryana", "Chandigarh");

		// System.out.println(map);

		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("Key : " + entry.getKey() + ", and value : " + entry.getValue());
		}
       System.out.println("============================");
//		LinkedHashMap<String, String> linked = new LinkedHashMap<String, String>();
//		linked.put("Bihar", "Patna");
//		linked.put("Bihar", "Patliputra");
//		linked.put("Karnatka", "BLR");
//		linked.put("Gujrat", "Gandhi nagar");
//		linked.put("Punjab", "Chandigarh");
//		linked.put("Haryana", "Chandigarh");
//
//		Set<Entry<String, String>> entrySet = linked.entrySet();
//		Iterator<Entry<String, String>> itr1 = entrySet.iterator();
//		while (itr1.hasNext()) {
//			Entry<String, String> entry = itr1.next();
//			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
//		}
		// System.out.println(linked);

		TreeMap<String, String> tree = new TreeMap<String, String>();
		tree.put("Bihar", "Patna");
		tree.put("Bihar", "Patliputra");
		tree.put("Karnatka", "BLR");
		tree.put("Gujrat", "Gandhi nagar");
		tree.put("Punjab", "Chandigarh");
		tree.put("Haryana", "Chandigarh");

		Set<Entry<String, String>> entryset = tree.entrySet();
		Iterator<Entry<String, String>> itr2 = entryset.iterator();
		while (itr2.hasNext()) {
			Entry<String, String> entry = itr2.next();
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());

		}
		// System.out.println(tree);

	}

}
