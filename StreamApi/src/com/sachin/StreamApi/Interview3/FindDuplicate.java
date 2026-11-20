package com.sachin.StreamApi.Interview3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 3, 2, 5, 6, 4, 85, 6, 1, 2);
		Set<Integer> duplicates = nums.stream().filter(n -> Collections.frequency(nums, n) > 1)
				.collect(Collectors.toSet());
		System.out.println(duplicates);
	}

}
