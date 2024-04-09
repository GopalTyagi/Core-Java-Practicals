package com.mycollection;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class BookVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("one");
		v.add("two");
		
		//print all elements by iterator
		Iterator it = v.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
		
		//print all elements by enumerator
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			String str = (String)en.nextElement();
			System.out.println(str);
		}
	}

}
