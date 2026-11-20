package com.kodewala.serialization.laptop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lap.ser"));
		Laptop laptop = (Laptop) ois.readObject();
		ois.close();

		System.out.println("Serial Number : " + laptop.getSerialNumber());
		System.out.println("Brand Name :" + laptop.getBrand());
		System.out.println("Laptop Price :" + laptop.getPrice());
		System.out.println("Laptop Password :" + laptop.getPassword());
	}

}
