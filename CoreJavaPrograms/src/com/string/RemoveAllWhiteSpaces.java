package com.string;

public class RemoveAllWhiteSpaces {
	public static void main(String[] args) {
		
	
	String str = "  G  OP A  L  _ T Y A   G  I";
	String name = str.replaceAll("\\s","");
	System.out.println(name);
	}
}
  