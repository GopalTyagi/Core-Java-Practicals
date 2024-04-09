package com.string;

public class ReplaceAndReplaceAll {
	public static void main(String[] args) {
		
		String s = "Gopal Tyagi";
		String s1 = "This is java";
		String s2 = new String("This is Java");
		
		System.out.println(s.replace("G", "Bh"));
		System.out.println(s.replaceFirst("a", "ji"));
		System.out.println(s.replaceAll("a", "A"));
		System.out.println(s.replace(s2, s));
		System.out.println(s.replaceAll("p(.*)", "ooo"));
		
		System.out.println("Heap Area = " + s1.replace("is", "was"));
		System.out.println("Heap Area = " + s1.replaceFirst("is", "was"));
		System.out.println("Heap Area = " + s1.replaceAll("is", "was"));
		System.out.println("Heap Area = " + s1.replaceAll("is(.*)", "sss"));
		System.out.println(s==s1);
	}

}
