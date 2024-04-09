package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataFromOneToAnotherFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("C:\\Users\\DELL\\Desktop\\gopal1.txt");
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\DELL\\Desktop\\tyagi.txt");
		
		int i ;
		while((i=fi.read())!=-1) {
			fo.write((char)i);
			
		}System.out.println("Completed");
		
	}

}
