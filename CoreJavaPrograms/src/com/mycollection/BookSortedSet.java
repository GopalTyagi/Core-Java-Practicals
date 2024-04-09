package com.mycollection;


import java.util.SortedSet;
import java.util.TreeSet;

public class BookSortedSet {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add("one");
		s.add("two");
		s.add("three");

		// Elements are automatically sorted in Asce order

		for (Object o : s) {
			System.out.println(o);
		}

		// get first elememt
		System.out.println(s.first());

		// get last element
		System.out.println(s.last());
		
		//System.out.println(s.headSet("two"));
		//System.out.println(s.tailSet("one"));
		//System.out.println(s.subSet("one", "three"));
	}

}
