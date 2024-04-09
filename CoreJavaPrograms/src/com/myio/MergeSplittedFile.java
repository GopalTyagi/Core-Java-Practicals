package com.myio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeSplittedFile {
	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("C:\\Users\\DELL\\Desktop\\gogo.txt");
		FileReader fr2 = new FileReader("C:\\Users\\DELL\\Desktop\\gogo1.txt");
		
		int a1 = fr1.read();
		int a2 = fr2.read();
		
		FileWriter fw = new FileWriter("C:\\Users\\DELL\\Desktop\\gopal.txt");
		while(a1 != -1 ) {
			fw.write(a1);
			a1 =fr1.read();
		}
		while(a2 != -1) {
			fw.write(a2);
			a2 = fr2.read();
		}
		fw.close();
		fr2.close();
		fr1.close();
		System.out.println("Files are merged");
		
	
	}

}
