package com.kodewala.serialization.mobile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDriver {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Mobile mobile = new Mobile(1195561115, "Oppo", "OppoK14", 15999.00, 12344);

		ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("mob.ser"));
		ois.writeObject(mobile);
		ois.close();

		System.out.println("Serializtion Is Wprking");
	}

}
