package com.sachin.inheritance6.castingupdown;

public class ObjectFactory {
	public static Object getObject(String name) {
		Object obj = null;
		if(name.equalsIgnoreCase("Product")) {
			obj = new Product();
		}else if (name.equalsIgnoreCase("ElectronicProducts")) {
			obj = new ElectronicProducts();
		}else {
			System.out.println("Invalid Type");
		}
		return obj;
	}
}
