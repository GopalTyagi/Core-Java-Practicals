package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWithScanner {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\DELL\\Desktop\\gopal1.txt");
		Scanner sc = new Scanner(fr);
		while (sc.hasNext()) {
			
			String s = sc.next();//character by character
			// if you user nextline() then in single line
			System.out.println(s);

		}
		fr.close();
	}

}
