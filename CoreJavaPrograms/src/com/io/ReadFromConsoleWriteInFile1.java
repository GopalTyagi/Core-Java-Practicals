package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromConsoleWriteInFile1 {
	public static void main(String[] args) throws IOException {
		// read data from console
		InputStreamReader b = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(b);

		// write data into file
		PrintWriter pw = new PrintWriter(new FileWriter("D://tyagi.txt"));
		System.out.println("Enter data..");
		String s = br.readLine();
		while (!s.equals("Quit")) {
			pw.println(s);
			System.out.println(s);
			s = br.readLine();
		}
		pw.close();
		br.close();
		System.out.println("scanned");
	}

}
