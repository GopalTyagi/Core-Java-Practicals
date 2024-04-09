package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class TextAppendIntoExistingFileExample {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D://gopal.txt",true);
		
		fw.write(" Tyagi");
		fw.close();
		System.out.println("Successfully......");
	}

}


