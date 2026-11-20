package com.kodewala.serialization.employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"));
		
		Employee emp = (Employee) ois.readObject();
		ois.close();
		
		System.out.println("Employee Id : " + emp.getEmployeeId());
		System.out.println("Employee Name : " + emp.getEmoloyeeName());
		System.out.println("Employee Salary : " + emp.getSalary());
		System.out.println("Employee Password : " + emp.getPassword());
	}

}
