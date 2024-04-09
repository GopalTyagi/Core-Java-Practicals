package com.string;

public class LengthWithoutSpace {
	public static void main(String[] args) {
		String name = "Gopal tyagi";
		int count = 0;
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}
}