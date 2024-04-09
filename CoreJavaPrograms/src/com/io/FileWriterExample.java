package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("C:\\Users\\DELL\\Desktop\\gopal.txt");
	fr.write("Gopal TYagi");
	System.out.println("Succesfull......");
	fr.close();
	}

}
