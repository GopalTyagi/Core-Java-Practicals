package com.io;

import java.io.File;

public class FileDirectory2 {
	public static void main(String[] args) {
		File f = new File("D:\\");
		String[] list = f.list();
		for(int i=0; i<list.length;i++) {
			System.out.println(list[i]);
		}//read file and directory both
	}

}
