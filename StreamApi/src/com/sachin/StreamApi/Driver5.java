package com.sachin.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver5 {

	public static void main(String[] args) {
		// Find the String that Start with "B".
		List<String> list = Arrays.asList("Bangalore", "Chennai", "Hyderabad", "Delhi", "Raipur", "Jaipur", "Mumbai",
				"Hyderabad");

		// Single Thread
		List<String> output = list.stream().filter(w -> w.startsWith("B")).collect(Collectors.toList());
		// Processing 1 gb data ----> 5 min
		System.out.println(output);

		
		// Parallel Stream
		List<String> output1 = list.parallelStream().filter(w -> w.startsWith("B")).collect(Collectors.toList());
		// it will take less time to execute the Program
		System.out.println(output1);
	}

}
