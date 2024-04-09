package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageEx {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("C://Users//DELL//Pictures//Screenshots//Screenshot (129).png");

		FileOutputStream fo = new FileOutputStream("C://Users//DELL//Pictures//Screenshots//adiyogi1.png",true);

		int i = fi.read();

		while (i != -1) {
			fo.write(i);
			i = fi.read();
		}
		fi.close();
		fo.close();
		System.out.println("Success");

	}

}
