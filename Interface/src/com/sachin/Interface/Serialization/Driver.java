package com.sachin.Interface.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// To Create an Object
		Account acc = new Account("Anjali", 5000, "Punb02120", "Siwan");

		// Todo - Send acc to network / write to file system / database
		// We will write object to file system

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("acc.ser"));
		oos.writeObject(acc);
		System.out.println("Serialization Successfully...");
	}

}
