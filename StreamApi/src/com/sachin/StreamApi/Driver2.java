package com.sachin.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("CHE", "Dl", "HYD", "BLR", "CHE", "AHM", "HYD", "BLR", "CH");
//		List<String> out = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(out);
		// Using for each loop
		// list.stream().distinct().forEach(e -> System.out.println(e));

		// filter the city Starting with c and give me first city using Limit
//		 list.stream().distinct().filter(c -> c.startsWith("C")).limit(1).forEach(e ->
//		 System.out.println(e));

		// Sort the element
		// list.stream().filter(c -> c.startsWith("C")).sorted().forEach(e ->
		// System.out.println(e));

		// Skip the element from the List
		// list.stream().skip(4).forEach(e -> System.out.println(e));

		// Find first
		Optional<String> output = list.stream().findFirst();
		System.out.println(output);
	}
}
