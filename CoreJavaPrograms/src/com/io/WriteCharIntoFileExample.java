package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharIntoFileExample {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("D://gopal.txt");
		
		char[] ch = {'H','i'};
		fw.write(ch);
		fw.write(',');
		fw.write("Gopal ...");
		fw.close();
		
		System.out.println("Successfull......");
	}

}


