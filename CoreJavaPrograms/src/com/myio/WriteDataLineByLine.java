package com.myio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataLineByLine {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D://gopal.txt");
		PrintWriter pw = new PrintWriter(fw);
		for(int i=0; i<5; i++) {
			pw.println(i + ": jawaan");
		}
		pw.close();
		fw.close();
	}

}
