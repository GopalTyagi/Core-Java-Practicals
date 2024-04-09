package com.io;

import java.io.File;
import java.io.IOException;

public class RenameFile {
	public static void main(String[] args) throws IOException{
		File f = new File("D://gopal.txt");
		File f1 = new File("D://tyagi.txt");
		
		if(f.exists()) {
			System.out.println(f.renameTo(f1));
		}else{
			System.out.println("File does not exists");
		}
	}
}
