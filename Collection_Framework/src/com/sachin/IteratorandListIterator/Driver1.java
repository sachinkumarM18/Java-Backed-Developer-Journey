package com.sachin.IteratorandListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Driver1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		ListIterator<String> itr = list.listIterator();
		// Forword
		
		System.out.println(itr.next());
		

		itr.previous();

		itr.add("X");

		System.out.println(itr.next());

		itr.remove();

		//System.out.println(list);
		
		//itr.next();
		//itr.next();
		//itr.previous();
		//itr.add("X");
		//System.out.println(itr.next());
//		itr.remove();
//		itr.remove();
		//itr.add("Z");
		//System.out.println(itr.previous());b
		//while (itr.hasNext()) {
			//String value = itr.next();
			//System.out.println("Forword : " + itr.next());
//			if(value.equals("B")) {
//				itr.set("Z");
//			}
			
		//}
		
		// BackWord
//		while(itr.hasPrevious()) {
//			System.out.println("Backword : " + itr.previous());
//		}
		//System.out.println(list);
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()) {
//			String value = itr.next();
//			if(value.equals("B")) {
//				itr.remove();
//			}
//		}
		System.out.println(list);
		 
	}

}
