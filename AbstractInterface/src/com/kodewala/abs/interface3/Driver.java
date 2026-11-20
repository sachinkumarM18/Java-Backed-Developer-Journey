package com.kodewala.abs.interface3;

public class Driver{
	 public static void main(String[] args) throws CloneNotSupportedException{
		 Employee e1 = new Employee("Ajay", "Blr");
		 
		 Employee e2 = (Employee) e1.clone();
		 System.out.println(e2.location + " " + e2.name);
	 } 	 
}