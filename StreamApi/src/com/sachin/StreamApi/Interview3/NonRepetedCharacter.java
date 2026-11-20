package com.sachin.StreamApi.Interview3;

public class NonRepetedCharacter {

	public static void main(String[] args) {
		String input = "Hello";
		Character firstNonRepetive = input.chars().mapToObj(c -> (char) c)
				.filter(ch -> input.indexOf(ch) != input.lastIndexOf(ch)).findFirst().orElse(null);
		System.out.println(firstNonRepetive);
	}
}
