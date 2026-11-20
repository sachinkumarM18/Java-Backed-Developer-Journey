package com.sachin.inheritance6.castingupdown;

public class Driver {

	public static void main(String[] args) {
		Manager e1 = new Manager();
		int a  = 10;
		
		// Up Casting 
		Employee e2 = (Employee) new Manager(); // Super / parent can refer child class object
		
		// let Child class refer the parent class object
		Manager mgr = (Manager) new Employee(); // down Casting
	}

}
