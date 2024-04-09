package com.exception;

public class forruntimeex {
	public static boolean isValidUser() {
		return false;
	}

	public static void main(String[] args) {
		boolean userfound = isValidUser();
		if (userfound) {
			System.out.println("Valid user");
		} else {
			RuntimeException e = new RuntimeException();
			System.out.println("invalid");
			
			throw e;
		}
	}

}
