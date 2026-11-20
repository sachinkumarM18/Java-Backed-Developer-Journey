package com.kodewala.exception6File;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Driver1 {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("File.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeObject("Welcome to Java Serialization");

			System.out.println("Data written successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
