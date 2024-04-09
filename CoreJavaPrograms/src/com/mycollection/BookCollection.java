package com.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class BookCollection {
	public static void main(String[] args) {
		// create a collection
		Collection c = new ArrayList();

		// Add elements into Collection
		c.add("Bura mat dekho");
		c.add("Bura mat Suno");
		c.add("Bura mat Kaho");

		System.out.println("Length of Collection is = " + c.size());

		// Print all elements of Collection
		for (Object o : c) {
			System.out.println(o);
		}
		// Convert collection into Array
		Object [] ar = c.toArray();
		System.out.println(c);
		// Print all elements of array

		for (Object ele : ar) {
			String s = (String) ele;
			System.out.println(s);
		}

	}

}
