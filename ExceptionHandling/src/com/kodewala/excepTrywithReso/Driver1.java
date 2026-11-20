package com.kodewala.excepTrywithReso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver1 {

	public static void main(String[] args) throws IOException {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.xtx"));)
		{
			System.out.println("Driver.main()");
		} catch (NullPointerException | ArithmeticException | IOException e)  // Exception should not be relateed.
		{
			e.printStackTrace();
		}
	}

}
