package com.javabasic;

public class SecondHighest {

	public static void main(String[] args) {

		int []t = {56,80,9,167,54};
		int temp =0;
		int c=0;
		for(int i=0; i<t.length; i++) {
			if(temp < t[i]) {
				c=temp;
				temp = t[i];
			}
			if(c<t[i] && temp>t[i]) {
				c=t[i];
			}
		}
		System.out.println("Second Highest = " +c );
	}
}
