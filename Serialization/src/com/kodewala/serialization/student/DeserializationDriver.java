package com.kodewala.serialization.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDriver {
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
		Student student = (Student) ois.readObject();
		ois.close();

		System.out.println("Roll No: " + student.getRollNo());
		System.out.println("Name : " + student.getName());
		System.out.println("PassWord :" + student.getPassword());
	}
}
