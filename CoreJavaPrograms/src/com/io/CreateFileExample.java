package com.io;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\DELL\\Desktop\\gopal2.txt");
		
		if(f.createNewFile()) {
			System.out.println("created");
			
		}else {
			System.out.println("not crearted");
		}
	}
}
