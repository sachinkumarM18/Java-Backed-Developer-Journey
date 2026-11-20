package com.sachin.StreamApi.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Products {
	String name;
	double price;

	public Products(String name, double price) {
		this.name = name;
		this.price = price;
	}
}

class Driver2 {

	public static void main(String[] args) {
		Products p1 = new Products("Banana", 299);
		Products p2 = new Products("Apple", 1001);
		Products p3 = new Products("Mango", 1100);
		Products p4 = new Products("Grapes", 13990);

		List<Products> fruits = Arrays.asList(p1, p2, p3, p4);
		List<String> details =fruits.stream()
        .filter(pro -> pro.price > 1000)	
        .map(pro -> pro.name + " : " +(pro.price * 0.90)).toList();
		System.out.println(details);
       


		// Converting 2D Array into 1D array by using flatMap
//		List<List<String>> states = Arrays.asList(Arrays.asList("Bihar", "UttarPradesh", "Jharkhand"),
//				Arrays.asList("Karnatka", "Tamilnadu", "Kerla"));
//		List<String> showDetails = states.stream().flatMap(list -> list.stream()).toList();
//		System.out.println(states);
//		System.out.println(showDetails);
	}

}
