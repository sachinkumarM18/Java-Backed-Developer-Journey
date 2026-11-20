package com.kodewala.abs.interface3;

 class Employee implements Cloneable{
	 String name;
	 String location;
	 
	 public Employee(String name, String location) {
		 super();
		 this.name = name;
		 this.location = location;
	 }
	 
	 @Override
	 public Object clone() throws CloneNotSupportedException{
		 return super.clone();
	 }
	 
}
 