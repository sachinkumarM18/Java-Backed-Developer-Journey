package com.sachin.StreamApi.Interview3;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequesncyCount {

	public static void main(String[] args) {
//		String input = "Banana";
//		Map<Object, Long> out = input.chars().mapToObj(c -> (char) c)

//				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//		System.out.println(out);

		String iplTeam = "RoyalChallengerBangalore";
		Map<Character, Long> output = iplTeam.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(output);
	}

}
