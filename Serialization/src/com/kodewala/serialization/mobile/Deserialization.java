package com.kodewala.serialization.mobile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream oos = new ObjectInputStream(new FileInputStream("mob.ser"));
		Mobile mobile = (Mobile) oos.readObject();
		oos.close();

		System.out.println("Mobile IMEI Number : " + mobile.getImeiNumber());
		System.out.println("Brand : " + mobile.getBrandl());
		System.out.println("Model : " + mobile.getModel());
		System.out.println("Price : " + mobile.getPrice());
		System.out.println("Unlock Pin : " + mobile.getUnlockPin());
	} 
}
