package com.myio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentSerTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ObjectInputStream out = new ObjectInputStream(
				new FileInputStream("D://gopal.txt"));
				
	}

}
