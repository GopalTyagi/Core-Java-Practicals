package com.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("C:\\Users\\DELL\\Desktop\\gopal.txt");
		PrintWriter pw  = new PrintWriter(fw);
		
		/////////////////////OR///////////////////
//		PrintWriter pw = new PrintWriter(new FileWriter("D:/NeerajIO.txt"));
		pw.write("My Name is Gopal...Tyagi....");
		System.out.println("Completed....");
		pw.close();
		fw.close();
		
	}
}