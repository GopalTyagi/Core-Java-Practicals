package com.string;

public class Lastname {

	public static void main(String[] args) {

		String name = "gopal tyagi";
		
		String [] s = name.split(" ");
		String l = s[s.length-1];
		System.out.println(l);
	}
}
 