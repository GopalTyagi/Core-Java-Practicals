package com.exception;

public class TestCheckedCoustomException {
	public static void main(String[] args) {
		dad();
	}

	static void dad() {
		try {
			son();
		} catch (CheckedCoustomException e) {
			System.out.println(e);
		}
	}
	static void son() throws CheckedCoustomException {
		throw new CheckedCoustomException();
	}
}
