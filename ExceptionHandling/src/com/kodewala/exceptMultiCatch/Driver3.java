package com.kodewala.exceptMultiCatch;

public class Driver3 {

	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.length());
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("A");
		} catch (NullPointerException e) {
			System.out.println("B");
		}

		catch (Exception e) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
	}

}
