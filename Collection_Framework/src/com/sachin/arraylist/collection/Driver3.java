package com.sachin.arraylist.collection;

import java.util.ArrayList;

public class Driver3 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(5);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(78);
		numbers.add(25);
		numbers.add(15);
		numbers.add(45);
		numbers.add(65);
		
		//Integer number = numbers.remove(2); 
		System.out.println(numbers.remove(Integer.valueOf(78)));
		System.out.println(numbers);
	}

}
