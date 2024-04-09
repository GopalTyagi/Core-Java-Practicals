package com.io;

import java.io.File;

public class FileDirectory1 {
	public static void main(String[] args) {
		File d = new File("D://");
		File[] list = d.listFiles(); // only file name read
		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				System.out.println(list[i].getName());
			}
		}
	}

}
