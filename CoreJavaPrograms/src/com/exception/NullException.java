package com.exception;

public class NullException {
	public static void main(String[] args) {
		
		String name = null;
		
		try {
			System.out.println(name.charAt(1));
		} catch (NullPointerException e) {
			//e.getStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
