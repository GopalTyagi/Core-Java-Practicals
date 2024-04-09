package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharByCharExample {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\DELL\\Desktop\\gopal.txt");
		int i = fr.read();
		while(i!=-1) {
			System.out.println((char)i);
			i=fr.read();
		}
		fr.close();
	}

}
