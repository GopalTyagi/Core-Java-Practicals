package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {
	public static void main(String[] args) {

		List l = new ArrayList();
		List l1 = new LinkedList();
		List l2 = new Vector();

		// methods of ArrayList class
		l.add(12);
		l.add(13);
		l.add(2.32);
		l.add('G');
		l.add("Gopal");
		l.add(2, "hi"); // it will add in 2 index
		System.out.println(l);

		l.get(2); // it will return element of index 2
		System.out.println(l.get(2));

		l.set(2, "Hey"); // it will set hey at index 2
		System.out.println(l);

		l.remove(0); // it will remove element of index 0
		System.out.println(l);

		l.remove(2.32); // it will remove 2.32 from the list
		System.out.println(l);
		
		int a = l.indexOf("Gopal"); //it will return index of rathore
		System.out.println(a);
		
		int b = l.lastIndexOf("Gopal"); //it will return last index of gopal
		System.out.println(b);
		
		 //it will retrun sublist
		System.out.println(l.subList(0, 2));
		
		l.add(null);
		
		System.out.println(l);
		

	}

}
