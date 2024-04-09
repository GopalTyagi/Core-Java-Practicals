package com.collection;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		// Creating object of Stack class
		Stack s = new Stack();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5); // Push method add element into stack
		System.out.println(s);

		System.out.println(s.peek());  // peek reterive an element not remove
		System.out.println(s);
		// System.out.println();

		System.out.println(s.pop());  //top element 5 is remove by pop method
		
		System.out.println(s);
		System.out.println(s.pop());
		//System.out.println(s.pop());
		//System.out.println(s);
		//System.out.println(s.pop());// s.pop() method used to access the element
		//System.out.println(s.pop());// last in first out

	}

}
