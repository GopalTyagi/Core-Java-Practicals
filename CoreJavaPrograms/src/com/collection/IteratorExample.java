package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		/*
		 * Iterator it = a.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		Iterator it = a.iterator();
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			System.out.println(i);
		}
		
		//Once Iteration method start we can not make changes
		ArrayList a1 = new ArrayList();

	}

}
