package com.mycollection;


import java.util.HashSet;
import java.util.Iterator;

public class BookHashSet {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("om");
		h.add("omkar");
		h.add("omkaresh");
		h.add("omkareshwar");
		
		//Doesn't maintain any order
		System.out.println(h);
		
		Iterator it = h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
