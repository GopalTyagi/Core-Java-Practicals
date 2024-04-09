package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics {

	// Generics - it defines the datatype of collection element

	public static void main(String[] args) {

		// WithOut Generics

		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add("Name");

		// Here all type of data element can be added
		System.out.println(a);

		Iterator it = a.iterator();
		while (it.hasNext()) {
			Object o = (Object) it.next();
			// here we need to typecast the elements
			System.out.println(o);
		}

		// GENERICS
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		// here generics is applied
		a1.add(1);
		a1.add(2);
		a1.add(3);
		// a1.add("Name"); it will give compile time
		// error because after generics same kind of data elements
		// can be inserted

		System.out.println(a1);

		Iterator<Integer> it1 = a1.iterator();
		while (it1.hasNext()) {
			int i = it1.next(); // there is no need to typecast
			System.out.println(i);
		}

	}

}
