// Otp Generator 

package com.kodewala.date28.interf6;

import java.util.Random;
import java.util.function.Supplier;

public class Driver2 {

	public static void main(String[] args) {
		Random random = new Random();
		Supplier<Integer> otpSupplier = () -> 100000 + random.nextInt(900000);
		System.out.println("Generated OTP : " + otpSupplier.get());
	}
}
