package com.string;

import java.util.Arrays;

public class SortingOfString {

	public static void main(String[] args) {

		String str = "Gopal tyagi ";
		String name = str.toLowerCase();
		char[] ch = name.toCharArray();

		Arrays.sort(ch);
		System.out.println(ch);

	}

}
