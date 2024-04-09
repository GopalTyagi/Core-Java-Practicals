package com.exception;

public class Hierarchy {
	public static void main(String[] args) {

		String name = "gopal";
		try {
			System.out.println(name.charAt(10));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
