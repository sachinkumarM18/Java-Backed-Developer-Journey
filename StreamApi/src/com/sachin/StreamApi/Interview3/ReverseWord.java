package com.sachin.StreamApi.Interview3;

import java.util.Arrays;
import java.util.stream.Collectors;


public class ReverseWord {

	public static void main(String[] args) {
		String sentence = "Kodewala is Java Training Academy";
		String result = Arrays.stream(sentence.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(result);
//		String result = Arrays.stream(sentence.split(" "))
//			    .map(word -> new StringBuilder(word).reverse().toString())
//			    .collect(Collectors.joining(" "));
	}

}
