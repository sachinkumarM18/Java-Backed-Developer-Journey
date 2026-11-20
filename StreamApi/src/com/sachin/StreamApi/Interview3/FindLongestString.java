package com.sachin.StreamApi.Interview3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("cat", "elephant", "Tiger", "hippopotamus", "Zebra");
		String longest = words.stream().max(Comparator.comparingInt(String::length)).orElse(" ");
		System.out.println("Longest Word : " + longest);

	}

}
