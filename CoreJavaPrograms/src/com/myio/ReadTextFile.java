package com.myio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D://gopal.txt");
		int ch = fr.read();
		while (ch != -1) {
			System.out.println((char) ch);
			ch = fr.read();
		}
		fr.close();

	}

}
