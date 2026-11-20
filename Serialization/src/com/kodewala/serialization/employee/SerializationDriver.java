package com.kodewala.serialization.employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDriver {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Employee emp = new Employee(101, "Ajs", 1500.2, "sajkld");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));

		oos.writeObject(emp);
		oos.close();

		System.out.println("Successfully Created Serialization");
	}
} 