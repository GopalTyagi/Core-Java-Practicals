package com.mycollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();
		l.add(12);
		l.add(13);
		l.add(14);

		System.out.println(l);
		System.out.println(l.contains(15)); // return boolean value
		System.out.println(l.hashCode()); // return integer number
		System.out.println(l.isEmpty()); // return boolean false
		System.out.println(l.remove(12)); // return boolean true
		System.out.println(l);
		System.out.println(l.retainAll(l)); // return false
		System.out.println(l.size()); // return size of elements

		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		l.toArray(); // again insert values in array
		System.out.println(l);
		l.clear(); // clear all the data blank array remain
		System.out.println(l);

	}

}
