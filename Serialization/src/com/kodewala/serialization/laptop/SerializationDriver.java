package com.kodewala.serialization.laptop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;;

public class SerializationDriver {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Laptop lap = new Laptop(106, "Mac", 99999.99, "laptop002");

		ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("lap.ser"));

		ois.writeObject(lap);
		ois.close();

		System.out.println("Serialization is Working");
	}

}
