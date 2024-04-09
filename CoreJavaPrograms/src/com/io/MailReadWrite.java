package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MailReadWrite {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("D://gopal.txt"));
		FileWriter fw = new FileWriter("D://tyagi.txt");
		PrintWriter pw = new PrintWriter(fw);
		String s = br.readLine();
	//	String regex = "^[_A-Za-Z0-9],(\\[_A-Za-Z0-9].*@[_A-Za-a0-9].[_A-ZA-Z0-9].";
		while (s != null) {
			if (s.endsWith("@gmail.com")) {
				pw.write(s);
				System.out.println(s);
			}
			s = br.readLine();
		}
		pw.close();

	}

}
