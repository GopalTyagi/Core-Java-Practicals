package com.mycollection;

import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {

		Vector v = new Vector(); // Vector follow insertion(as it as ) order
		v.add(1);
		v.add("gopal");
		v.add(2);
		v.add("krishna");
		v.add(3);
		v.add("mangal");

		System.out.println(v);

		System.out.println(v.capacity()); // By default capacity of vector is 10
		// Vector capacity increase by double of its size

		System.out.println(v.contains(2)); // return boolean value true if element exist

		System.out.println(v.elementAt(1)); // it will return element present on index 1

		System.out.println(v.firstElement()); // it fetch first element from list

		System.out.println(v.get(3)); // it return element present on index 3

		System.out.println(v.hashCode());

		System.out.println(v.indexOf("gopal")); // if it find element than return index
		// and not find element than return -1

		System.out.println(v.isEmpty()); // if element exist than it return false boolean type

		System.out.println(v.lastElement()); // it return lastelement present in list

		System.out.println(v.remove(5)); // remove the element by indexing

		System.out.println(v.removeElement("krishna")); // it return boolean type (T/F) if executed

		System.out.println(v.size()); // it return the size of list

		System.out.println(v.subList(1, 4)); // it return a list from index 1 to 4 in array

	}

}
