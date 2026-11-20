package com.sachin.StreamApi.Interview3;

import java.util.Arrays;
import java.util.List;

public class SumofSquareOfEvenNumber {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 5, 10, 6, 4, 9, 7);
		Integer output = nums.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();
		System.out.println(output);
	}

}
