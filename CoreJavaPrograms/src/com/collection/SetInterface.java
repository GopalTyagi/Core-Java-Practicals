package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {

		Set s = new HashSet();
		Set s1 = new TreeSet();
		Set s2 = new LinkedHashSet();

		// HashSet
		s.add(12);
		s.add(2.36);
		s.add('G');
		s.add("Gopal");

		System.out.println("HashSet return the value in random order");
		System.out.println(s); // HadhSet gives output in random order
		// only unique elements can be stored, duplicate is not allowed

		// Treeset

		s1.add(12);
		s1.add(36);
		s1.add(5);
		s1.add(45);
		System.out.println("TreeSet return the value in Ascending order");
		System.out.println(s1); // TreeSet gives output in Ascending order

		// LinkedHash
		s2.add(12);
		s2.add(36);
		s2.add(5);
		s2.add(45);
		System.out.println("LinkedHashSet return the value in insertion order");
		System.out.println(s2); // LinkedHashSet gives output in insertion order

	}

}
