package com.string;

public class LengthOfTheString {
	
	public static void main(String[] args) {
		
		String name = "Gopal Tyagi";
	//	System.out.println(name.length());
		int x=0;
		
		char[] ch = name.toCharArray();
		for(char c:ch) {
			x++;
		}
		System.out.println(x);
	}

}
