package com.io;

import java.io.File;
public class FileDirectory {
	public static void main(String[] args) {

		File directory = new File("C:\\Users\\Dell");

		String[] list = directory.list();

		for (int i = 0; i < list.length; i++) {
			File f = new File(directory, list[i]);
			if (f.isFile()) {

			 	System.out.println(i + 1 + "=" + list[i]);
			 	
			}
		}
	}

}
