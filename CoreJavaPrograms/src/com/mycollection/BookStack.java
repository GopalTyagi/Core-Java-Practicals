package com.mycollection;


import java.util.Stack;

public class BookStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(10);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s);
		
		//Returns top and does not remove it
		Object o = s.peek();
		System.out.println(o);
		
		//Returns top and removes it from stack
		Object o1 = s.pop();
		System.out.println(o1);
		System.out.println(s);
		
		Object o2 = s.pop();
		System.out.println(o2);
		System.out.println(s);
		
	}

}
