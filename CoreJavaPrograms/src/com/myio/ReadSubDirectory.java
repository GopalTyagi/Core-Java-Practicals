package com.myio;

import java.io.File;

public class ReadSubDirectory {
	public static void main(String[] args) {
		File directory = new File("c:/go");
		String[] files = directory.list();
		for (String f : files) {
			System.out.println(f);
		}

		// create a Sub directory
		File f = new File(directory, "test");
		f.mkdir();
		System.out.println("created");

		// rename a file delete a file or directory
		File file = new File("c:/a.txt");
		file.renameTo(new File("b.txt"));
		file.delete();
		file.deleteOnExit();
		System.out.println("Success");

	}

}
