package com.string;

import java.util.Arrays;

public class SeparateChar_Int_FromString_StoreInArray {

	public static void main(String[] args) {
		
		String str = "hpu23io42";
		
		char[] ch = str.toCharArray();
		String result  = "";
		String result1 = "";
	
		for(int i = 0; i<ch.length; i++) {
			if(!Character.isDigit(ch[i])) {
				result = result + String.valueOf(ch[i]);
				
			}else {
				result1 = result1 + String.valueOf(ch[i]);
			}
		}
		char[] x = result.toCharArray();
		char[] y = result1.toCharArray();
		
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(x));
		}

}
