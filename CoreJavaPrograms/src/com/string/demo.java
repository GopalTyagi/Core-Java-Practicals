package com.string;

public class demo {
	public static void main(String[] args) {
		String s="gopaal";
		int length=s.length();
		char[] ch=s.toCharArray();
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length(); j++) {
				if(ch[i]==ch[j]) {
					System.out.println("this is duplicate:"+ ch[j]);
				}
			}
		}
	}

}
