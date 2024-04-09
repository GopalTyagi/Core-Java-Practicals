package com.mystream;

public class AutoUnBoxing {
	public static void main(String[] args) {
		int a = 20;
		Integer wraper = a;
		System.out.println(a);
		System.out.println(wraper);
		
		Integer b = new Integer(100);
		int c = b;
		System.out.println(b);
		System.out.println(c);
		
		int i =7;
		Integer obj = i;  //Auto Boxing
		
		int j = obj;    //UnBoxing
		
		
		
	}

}
