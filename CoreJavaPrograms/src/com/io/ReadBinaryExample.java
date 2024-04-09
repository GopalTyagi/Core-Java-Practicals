package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinaryExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\gopal.txt");
		int i = fis.read();
		while( i!=-1) {
			System.out.println((char)i);
			i=fis.read();
		}
		fis.close();
	}

}
