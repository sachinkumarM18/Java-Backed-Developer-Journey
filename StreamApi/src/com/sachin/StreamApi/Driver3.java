package com.sachin.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver3 {

	public static void main(String[] args) {

//		List<String> cities = Arrays.asList("Hyderabad", "Surat", "Patna", "Mysore", "Chennai", "Jaipur", "Noida",
//				"Bangalore", "Girugram", "Chennai", "Delhi", "Mumbai", "Ahmedabad");
//		long total = cities.stream().collect(Collectors.counting());
//		System.out.println(total);
//		Map<Object, List<String>> result = cities.stream().collect(Collectors.groupingBy(c -> c.length()));
//		System.out.println(result);

//		List<Integer> input = Arrays.asList(32, 52, 64, 98, 23, 46, 65, 93, 45, 42, 85, 88, 44, 26, 96, 69, 56, 64, 84,
//				48);
//		Map<Boolean, List<Integer>> output = input.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
//		System.out.println(output);

		String input = "swiss";
//		List<Character> output1 = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
//		System.out.println(output1);
//		System.out.println();
//		Map<Object, Long> output2 = input.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//		System.out.println(output2);

		
//		Map<Object, Long> output = input.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//		System.out.println(output); 

		// first no repetitive Element
//		Character output = input.chars().mapToObj(c -> (char) c)
//				.filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)).findFirst().get();
//		System.out.println(output);

		// Find Repetitive Value
//		Character  output= input.chars().mapToObj(c -> (char) c).filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)).findFirst().get();
//		System.out.println();
	}

}
