package com.exception;

public class Array {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		try {
			System.out.println(a[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
