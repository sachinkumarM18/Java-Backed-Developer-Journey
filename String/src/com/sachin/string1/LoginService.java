package com.sachin.string1;

public class LoginService {

	public static void main(String[] args) {

		String email = "      admin@company.com      ";

		email = validate(email);

		System.out.println(email);
	}

	static String validate(String email) {

		return email.trim();
	}
}