package com.string;



public class Palindrome {
	
	public static void main(String[] args) {
		
		String name = "madam";
		String reverse = "";
		
	for(int i = name.length()-1 ; i>=0; i-- ) {
		reverse += name.charAt(i);
	}
	if(reverse.equals(name)) {
		System.out.println("this is palindrome");
	}else {
		System.out.println("not palindrome");
	}
		
		
		
	}

}
