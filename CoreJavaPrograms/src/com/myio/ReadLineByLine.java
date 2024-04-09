package com.myio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D://gopal.txt");
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		fr.close();
		br.close();

	
	}

}
