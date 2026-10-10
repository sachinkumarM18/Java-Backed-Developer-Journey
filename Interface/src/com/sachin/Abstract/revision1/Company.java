package com.sachin.Abstract.revision1;

public class Company {

	public static void main(String[] args) {
		Employee developer = new Developer("Sachin");
		Employee tester = new Testing("Anjali");

		developer.login();
		developer.work();
		developer.logout();

		System.out.println();

		tester.login();
		tester.work();
		tester.logout();
	}

}
