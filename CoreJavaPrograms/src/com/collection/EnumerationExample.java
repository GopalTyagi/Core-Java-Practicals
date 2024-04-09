	package com.collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationExample {

	// Enumeration is work with historical
	// classes only like vector and Hashtable
	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("----------------------------------------");
		Hashtable h = new Hashtable();
		h.put(1, 'a');
		h.put(2, 'b');
		h.put(3, 'c');
		h.put(4, 'd');
		System.out.println(h);
		Enumeration e1 = h.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
		//Iteration method will also work same as Enumeration
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
