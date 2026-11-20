package com.kodewala.exception6File;

public class Driver2 {

	public static void main(String[] args) {
		String name = null;
		
		//System.out.println(name.length()); // Null exception
		
		int num = 1000;
		int result = num / 0;
		
		try {
			System.out.println(result);
		} catch (NullPointerException e) {
			e.getMessage();
		}
		  // Arithmatic Exception Error
		
		
	}

}
