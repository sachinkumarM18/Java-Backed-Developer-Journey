package com.sachin.Interface.Lambda;

interface BonusCalculator {
	double calculate(double salary);
}

public class Driver2 {

	public static void main(String[] args) {

//		BonusCalculator bonus = salary -> salary * 0.10;
//		double result = bonus.calculate(50000);
//		System.out.println("Bonus : " + result);

		BonusCalculator normalBonus = salary -> salary * 0.10;

		BonusCalculator seniorBonus = salary -> salary * 0.20;

		BonusCalculator managerBonus = salary -> salary * 0.30;

		BonusCalculator fresherBonus = salary -> salary * 0.05;

		System.out.println("Normal Bonus : " + normalBonus.calculate(50000));
		System.out.println("Senior Bonus : " + seniorBonus.calculate(50000));
		System.out.println("Manager Bonus : " + managerBonus.calculate(50000));
		System.out.println("Freshser Bonus : " + fresherBonus.calculate(50000));
	}

}
