package com.sachin.Interface.DSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.sachin.Interface.Serialization.Account;

public class Driver2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("acc.ser"));
		Account acc = (Account) ois.readObject();

		System.out.println("DeSerialize Done......");

		System.out.println("Account :- " + acc.getName() + " " + acc.getBalance() + " " + acc.getIfcsCode() + " "
				+ acc.getLocation());
	}

}
