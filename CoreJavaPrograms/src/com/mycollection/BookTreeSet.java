package com.mycollection;


import java.util.Iterator;
import java.util.TreeSet;

public class BookTreeSet {
	public static void main(String[] args) {

		// It Sorts the elements in the ASCEN order

		TreeSet t = new TreeSet();
		t.add("zanjeer");
		t.add("awaz");
		t.add("darshan");
		t.add("bour");

		System.out.println(t);
		Iterator it = t.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
