package com.kodewala.serialization.account;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("acc.ser"));

		Account account = (Account) ois.readObject();

		ois.close();

		System.out.println("Object deserialized successfully.");

		System.out.println(account);
	}
}