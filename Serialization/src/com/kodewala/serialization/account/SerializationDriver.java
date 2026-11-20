package com.kodewala.serialization.account;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDriver {

	public static void main(String[] args) throws IOException {

		Account account = new Account(1200, "PUNB024", "Siwan");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("acc.ser"));  // to convert java Object to the binary byte

		oos.writeObject(account);

		oos.close();

		System.out.println("Account object serialized successfully.");
	}
}