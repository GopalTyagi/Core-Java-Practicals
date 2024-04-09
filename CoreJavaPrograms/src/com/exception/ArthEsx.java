package com.exception;

public class ArthEsx {
	public static void main(String[] args) {

		int k = 10;
		try {
			int j = k / 0;
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
