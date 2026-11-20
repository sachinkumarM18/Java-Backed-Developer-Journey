package com.kodewala.serialization.student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDriver {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		Student student = new Student(131, "Sachin", "Kumar@001");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
		oos.writeObject(student);
		oos.close();

		System.out.println("Student Serialized Successfully");
	}
}
