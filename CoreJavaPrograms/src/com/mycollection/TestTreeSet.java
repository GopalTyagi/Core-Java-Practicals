package com.mycollection;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(); // Elements in Asce order
		t.add(12);
		t.add(89);
		t.add(10);
		t.add(22);

		System.out.println(t);

		System.out.println(t.ceiling(10)); // return element without remove
		
		System.out.println(t.contains(22)); // return boolean value
		
		System.out.println(t.first()); // fetch first element and not remove

		System.out.println(t.higher(10)); // it will return higher value than 10 without remove

		System.out.println(t.lower(89));// it will return lower value than 89 not remove
		
		System.out.println(t.isEmpty()); // return boolean false
		
		System.out.println(t.last()); // return last value and not remove

		System.out.println(t.pollFirst()); // return first value and also remove it
		
		System.out.println(t.pollLast()); // return last value and also delete it

		//System.out.println(t.remove(22)); // return boolean value true
		
		System.out.println(t);
		
		System.out.println(t.size()); // return size of element
		
		// System.out.println(t.headSet(22));
		
		 //System.out.println(t.tailSet(10));
		// t.clear();

	}
}
