package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException {

		// char by char

		FileReader fr = new FileReader("D://gopal.txt");

		int i;
		System.out.println((char) fr.read());

		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
		fr.close();

		// Line By Line

		BufferedReader bf = new BufferedReader(new FileReader("D://gopal.txt"));

		String s = bf.readLine();
		System.out.println(s);
		while (s != null) {
			System.out.println(s);
			s = bf.readLine();

		}

		// Bytes

//		FileInputStream fis = new FileInputStream("D://Neeraj.txt");
//		int i;
//		System.out.println(fis.read());
//		while((i=fis.read())!=-1) {
//			System.out.print((char)i);
//		}
		/*
		 * }
		 * 
		 * }
		 */

	}
}
