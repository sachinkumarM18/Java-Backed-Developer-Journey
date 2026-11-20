package com.sachin.StreamApi.Interview3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListRemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3,4);
		List<Integer> list2 = Arrays.asList(4, 5, 6);

		List<Integer> merged = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
		System.out.println(merged);
	}

}
