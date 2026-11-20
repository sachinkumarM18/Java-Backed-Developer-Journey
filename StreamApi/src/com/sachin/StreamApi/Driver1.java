package com.sachin.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Driver1 {

	public static void main(String[] args) {

		// 1.  Storing the data
		//List<String> cities = Arrays.asList("Banglore", "Chennai", "Hyderabad", "Ahmedabad", "Ajmer");

		// 2.  Convert the collection to Stream object

		//Stream<String> inputStream = cities.stream();

		// 3. Find the name Starting with A Use Filter
		//Stream<String> filteredStream = inputStream.filter(city -> city.startsWith("A"));

		// 4. Collect or print the city name
		//List<String> cityStartWithA = filteredStream.collect(Collectors.toList());
		//System.out.println(cityStartWithA);
		
		// professional way
		//List<String> cityEndWithd = cities.stream().filter(w -> w.endsWith("d")).collect(Collectors.toList());
		//System.out.println(cityEndWithd);
		
		//List<String> output = cities.stream().filter(w -> w.endsWith("d")).map(word -> word.toUpperCase()).collect(Collectors.toList());
		//System.out.println(output); 
		
//		List<Integer> numbers = Arrays.asList(10,20,35,48,41,25);
//		List<Integer> output1 =numbers.stream().filter(w -> w % 5 == 0).map(w -> w * 2).toList();
//		System.out.println(output1);
		
		List<List<String>> cities1 = Arrays.asList(Arrays.asList("Bangalore" , "Chennai"),Arrays.asList("Hyderabad" , "Ahmedabad" , "Ajmer"));
		System.out.println(cities1);
		
		List<String> output = cities1.stream().flatMap(list -> list.stream()).filter(w -> w.startsWith("A")).map(word -> word.toUpperCase()) .collect(Collectors.toList());
		System.out.println(output);
	}

}
