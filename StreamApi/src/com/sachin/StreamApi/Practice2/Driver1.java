package com.sachin.StreamApi.Practice2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Driver1 {

	public static void main(String[] args) {

		// print the square of every even number greater than 10.
//		List<Integer> nums = Arrays.asList(5, 12, 8, 21, 30, 15, 4);
//		nums.stream().filter(n -> n > 10 &&  n % 2 == 0 ).map(n -> n * n).forEach(e -> System.out.println(e));

		// find the Names that
		// have more than 4 characters
		// start with "A" or "R"

//		List<String> names = Arrays.asList("Parvez", "Amit", "Rahul", "Sachin", "Ankit", "Raj");
//		names.stream().filter(name -> name.length() > 4 && (name.startsWith("R") || name.startsWith("A")))
//				.forEach(name -> System.out.println(name));

		// containing all city names in uppercase.

//		List<String> cities = Arrays.asList("Bangalore", "Chennai", "Hyderabad", "Ahmedabad");
//		cities.stream().map(city -> city.toUpperCase()).forEach(e -> System.out.println(e));

		// Distinct + Sorted

//		List<Integer> nums = Arrays.asList(10, 5, 20, 10, 5, 30, 20, 15);
//		nums.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).forEach(e -> System.out.println(e));

		// Find the first number greater than 15.

//		List<Integer> nums = Arrays.asList(5, 7, 11, 14, 18, 21, 25);
//		Optional<Integer> num =  nums.stream().filter(n -> n > 15).findFirst();
//		System.out.println(num);

		// AnyMatch / AllMatch / NoneMatch
		// 1. Are any numbers divisible by 7?
		// 2. Are all numbers even?
		// 3. Are none of the numbers negative?

//		List<Integer> nums = Arrays.asList(12, 18, 20, 24, 30);
//		boolean num1 = nums.stream().anyMatch(n -> n % 7 == 0);
//		boolean num2 = nums.stream().allMatch(n -> n % 2 == 0);
//		boolean num3 = nums.stream().noneMatch(n -> n < 0);
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);

		// flatMap
		// 1. Convert it into one Stream.
		// 2. Keep only even numbers.
//		3. Square them.
//		4. Print the result.

//		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5),
//				Arrays.asList(6, 7, 8));
//		numbers.stream().flatMap(list -> list.stream().filter(n -> n % 2 == 0).map(n -> n * n))
//				.forEach(num -> System.out.println(num));

		// String Transformation
//		remove words whose length is less than 5
//		convert remaining words to uppercase
//		sort them alphabetically
//		collect them into a List

//		List<String> words = Arrays.asList("java", "spring", "stream", "api", "backend");
//		words.stream().filter(word -> word.length() > 5).map(word -> word.toUpperCase()).sorted((a,b) -> a.compareTo(b)).forEach(e-> System.out.println(e));

		// Reduce
		// Use reduce() to calculate the total.

//		List<Integer> nums = Arrays.asList(100, 20, 30, 40, 50);
//		int sum = nums.stream().reduce(0, (a,b) -> a + b);
//		System.out.println("Additon of all Number is : " + sum);
//		int maxi = nums.stream().reduce(nums.get(0),(a,b) -> a > b? a : b);
//		System.out.println("Maximu Number from the List : " + maxi);

		// Using Stream API, print only the numbers that occur more than once.
		// expected Output : 10 , 20
		List<Integer> nums = Arrays.asList(10, 20, 30, 20, 40, 10, 50);
//		 nums.stream().filter(num -> nums.indexOf(num) !=
//		 nums.lastIndexOf(num)).forEach(e -> System.out.println(e)); // This is not valid
//		nums.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream()
//				.filter(e -> e.getValue() > 1).map(e -> e.getKey()).forEach(e -> System.out.println(e));
	}
}
