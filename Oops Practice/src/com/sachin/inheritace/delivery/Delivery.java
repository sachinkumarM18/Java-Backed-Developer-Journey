package com.sachin.inheritace.delivery;

 class Delivery {
	 static void estimateTime(String src,String dest) {
		 System.out.println("Delivery on Estimate time");
	 }
	 
}
 
 class ExpressDelivery extends Delivery{
	 static void estimateTime(String src,String dest) {
		 System.out.println("Express Delivery Mode on");
	 }
 }
