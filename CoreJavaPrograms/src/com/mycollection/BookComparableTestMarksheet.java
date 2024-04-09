package com.mycollection;


import java.util.ArrayList;
import java.util.Collections;

public class BookComparableTestMarksheet {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		a.add(new BookComparableMarksheet("A5", "Gopal", 89));

		a.add(new BookComparableMarksheet("A1", "mangal", 70));

		a.add(new BookComparableMarksheet("A9", "rohit", 88));
		
		//Sort elements by Comparable
		Collections.sort(a);
		//print all elements
		for(Object o : a) {
			System.out.println(o);
		}

	}

}
