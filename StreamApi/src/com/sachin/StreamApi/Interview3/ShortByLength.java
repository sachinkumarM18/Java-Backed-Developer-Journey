package com.sachin.StreamApi.Interview3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortByLength {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("banana", "apple", "kiwi", "grapes");
		words.stream().sorted(Comparator.comparingInt(w -> w.length())).forEach(word -> System.out.println(word));
	}
}
