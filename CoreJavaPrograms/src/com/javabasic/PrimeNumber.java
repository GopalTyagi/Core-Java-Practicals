package com.javabasic;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 2;
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Prime  Hai ");
		} else {
			System.out.println("Nahi Hai Prime");
		}

	}
}
