package com.collection;

public class EqualsAndHashCode {
	public static void main(String[] args) {
		String s = "Gopal";
		String s1 = "Gopal";
		System.out.println(s.equals(s1));
		//Check the value of String
		
		System.out.println(s.hashCode());
	//Returns the hascode of the value
		System.out.println(s1.hashCode());
	}

}
