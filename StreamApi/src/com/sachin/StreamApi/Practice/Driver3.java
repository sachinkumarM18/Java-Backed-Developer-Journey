package com.sachin.StreamApi.Practice;

import java.util.Arrays;
import java.util.List;

public class Driver3 {

	public static void main(String[] args) {
		List<List<String>> players = Arrays.asList(Arrays.asList("Virat", "Devilliers"),
				Arrays.asList("Rajat", "Bhuvi", "Hazalewood"));
		List<String> output = players.stream().flatMap(list -> list.stream()).toList();
		System.out.println(players);
		System.out.println(output);
	}

}
