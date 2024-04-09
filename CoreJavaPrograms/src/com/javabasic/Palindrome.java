package com.javabasic;

public class Palindrome {
	public static void main(String[] args) {

		int a = 131;
		int n = a;
		int rev = 0;
		// int sum=0;

		while (a != 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}
		if (n == rev) {
			System.out.println("Palindrome Hai");
		} else {
			System.out.println("Palindrome Nahi Hai");
		}
	}

}
