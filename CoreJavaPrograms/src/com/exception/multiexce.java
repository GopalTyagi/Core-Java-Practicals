package com.exception;

public class multiexce {
public static void main(String[] args) {
	String name = "gopal";
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(8));
	}catch(NullPointerException e) {
		System.out.println("name cannt null");
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println(e);
	}
}
}
