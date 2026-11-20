package com.sachin.StreamApi.Interview3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreatestNumberandMultiplication {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(8, 10, 25, 46, 86, 74, 14);
		// nums.stream().filter(n -> n > 20).mapToInt(n -> n *
		List<Integer> result = nums.stream().filter(n -> n > 20).map(n -> n * 2).collect(Collectors.toList());

		System.out.println(result);
	}

}
