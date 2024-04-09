package com.javabasic;

public class NoteCount {

	public static void main(String[] args) {

		int amt = 5100;
		int [] n = { 2000, 500, 200, 100, 50, 20, 10, 5 };
		int count = 0;

		for (int i = 0; i < n.length; i++) {
			count = amt / n[i];
			if (count > 0) {
				System.out.println(n[i] + "=" + count);
				amt = amt % n[i];
			}
		}
	}
}