package com.sachin.StreamApi.Interview3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(10, 20, 30, 40, 50, 60);
		Integer salary = number.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(salary);
	}

}
