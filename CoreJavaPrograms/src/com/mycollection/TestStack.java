package com.mycollection;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack(); // Last-in and First-Out
		s.push(10);
		s.push("gopal");
		s.push(2);

		System.out.println(s);

		System.out.println(s.empty()); // it return boolean value false

		System.out.println(s.peek()); // return the element from top but does not remove it

		System.out.println(s.search("gopal")); // it will search the element and return index

		System.out.println(s.pop()); // return the element from top also remove it(from last)

		System.out.println(s);
	}

}
