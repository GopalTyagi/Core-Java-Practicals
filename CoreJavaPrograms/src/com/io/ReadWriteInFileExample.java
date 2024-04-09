package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadWriteInFileExample {
	public static void main(String[] args) throws Exception {
		//read from console
		BufferedReader br =new BufferedReader(
				new InputStreamReader(System.in));
	
		//write data into file
		
		FileWriter fw = new FileWriter("D://tyagi.txt");
		PrintWriter pw = new PrintWriter(fw);
		System.out.println("Enter...");
		String s = br.readLine();
		pw.write(s);
		System.out.println(s);
		
		pw.close();
		fw.close();
	}

}
