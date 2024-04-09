package com.exception;

import java.io.FileInputStream;
import java.io.InputStream;

public class testFinally {
	public static void main(String[] args) {
		
		InputStream input = null;
		try {
			input = new FileInputStream("file.txt");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
