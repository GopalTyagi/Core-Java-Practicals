package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListImplementation {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(101);
		a.add(102);
		a.add(103);
		a.add(104);
		System.out.println(a);
		Collections.reverse(a);
		// we can also add in this way
		
		Integer i = new Integer(105);
		String s = new String("gopal");
		a.add(s);
		a.add(i);
		
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		
		//we can also get by this way
		Object o = a.get(4); //object form
		System.out.println("Index no 4 = "+o);
		
		Object o1 = a.get(5);
		System.out.println("Index no 5 = "+o1);
		System.out.println(o1.toString());
		
		Integer in = (Integer)a.get(3);
		System.out.println("Interger form "+in);
	}

}
