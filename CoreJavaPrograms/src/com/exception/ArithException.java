package com.exception;

public class ArithException {
	
	public static void main(String[] args) {
		
		int i=0;
		int j =15;
		try {
			System.out.println(j/i);
		}catch(Exception e) {
	e.printStackTrace();
		}
	}

}
