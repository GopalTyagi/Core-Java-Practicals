package com.mycollection;


import java.util.ArrayList;
import java.util.Collections;

public class BookArrayList {
	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("zero");
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("five");

		System.out.println(a);
		a.add(4, "four");
		System.out.println(a);

		// get an element by index
		String val = (String) a.get(1);
		System.out.println(val);

		// print all elements
		for (Object o : a) {
			String s = (String) o;
			System.out.println(s);
		}
		
		//sort the list
		Collections.sort(a);
		System.out.println(a);
		
		//create a sublist
		ArrayList sub = new ArrayList(a.subList(0, 4));
		System.out.println(sub);
		
		//convert to array
		a.toArray();
		System.out.println(a);
	}

}
