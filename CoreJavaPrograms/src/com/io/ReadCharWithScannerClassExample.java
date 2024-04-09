package com.io;

import java.util.Scanner;

public class ReadCharWithScannerClassExample {

	public static void main(String[] args) {
		char ch;
		System.out.println("Please enter character..");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);//read only single character
	System.out.println(ch);	
	}
}
