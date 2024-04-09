package com.mycollection;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(11);
		l.add(2);
		l.add("gopal");
		l.add(30);
		l.add(110);
		l.add(20);
		l.add("bhopal");
		l.add(13);
		
		System.out.println(l);  //it will follow insertion(as it is) order

		System.out.println(l.contains(11));  //it will return boolean value
		
		System.out.println(l.get(1));   //return elements present on index no.1
		
		System.out.println(l.hashCode());  //return hashcode value
		
		System.out.println(l.indexOf(3));  
		
		System.out.println(l.isEmpty());   //return boolean false
		
		System.out.println(l.lastIndexOf(l));
		
		System.out.println(l.remove(0));   //it will remove element present on index no.0
		
		System.out.println(l.set(4, "jatin"));
		
		System.out.println(l);
		
		System.out.println(l.size());
		
		System.out.println(l.subList(1, 3));
		
		
		
		
		
	}

}
