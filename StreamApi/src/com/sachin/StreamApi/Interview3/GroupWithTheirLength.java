package com.sachin.StreamApi.Interview3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWithTheirLength {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("one", "two", "three", "five", "six", "seven");
		Map<Integer, List<String>> grouped = words.stream().collect(Collectors.groupingBy(s -> s.length()));
		System.out.println(grouped);
	}

}
