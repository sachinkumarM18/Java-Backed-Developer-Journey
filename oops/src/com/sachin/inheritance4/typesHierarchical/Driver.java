package com.sachin.inheritance4.typesHierarchical;

public class Driver {

	public static void main(String[] args) {

		// ==========================================
		// DEVELOPER
		// ==========================================

		Developer developer = new Developer(101, "Sachin Kumar", "Java Backend", 90000, "Java", 10);

		System.out.println("========== DEVELOPER ==========");

		// Parent methods
		developer.displayEmployeeDetails();
		developer.calculateAnnualSalary();
		developer.companyPolicy();

		// Developer methods
		developer.displayDeveloperDetails();
		developer.writeCode();
		developer.calculateDeveloperBonus();

		System.out.println("\n================================");

		// ==========================================
		// TESTER
		// ==========================================

		Tester tester = new Tester(102, "Rishabh", "Quality Assurance", 40000, "Selenium", 30);

		System.out.println("============ TESTER ===========");

		// Parent methods
		tester.displayEmployeeDetails();
		tester.calculateAnnualSalary();
		tester.companyPolicy();

		// Tester methods
		tester.displayTesterDetails();
		tester.executeTesting();
		tester.generateTestReport();

		System.out.println("\n================================");

		// ==========================================
		// HR
		// ==========================================

		HR hr = new HR(103, "Narmatha", "Human Resources", 50000, 50, "Technical Interview");

		System.out.println("============== HR =============");

		// Parent methods
		hr.displayEmployeeDetails();
		hr.calculateAnnualSalary();
		hr.companyPolicy();

		// HR methods
		hr.displayHRDetails();
		hr.conductInterview();
		hr.generateOfferLetter();
	}
}