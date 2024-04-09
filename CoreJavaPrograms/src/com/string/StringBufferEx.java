package com.string;

public class StringBufferEx {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("java is programming language");
		System.out.println(sb);
		StringBuffer s = sb.reverse();
		System.out.println(s);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		StringBuffer s1 = new StringBuffer("Hello Gopal");
		System.out.println(s1);
		System.out.println(s1.replace(0, 4, "Gooo"));
		System.out.println(s1.delete(0, 4));
		System.out.println(sb.insert(5, "Th"));
		
	}

}
