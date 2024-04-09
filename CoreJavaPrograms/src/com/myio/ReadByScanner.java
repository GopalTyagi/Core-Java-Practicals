package com.myio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadByScanner {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D://gopal.txt");
		Scanner sc = new Scanner(fr);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
		fr.close();	
	}

}
