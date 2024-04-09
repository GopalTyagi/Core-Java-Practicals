package com.networking;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLReader {
	public static void main(String[] args) throws Exception {
		URL u = new URL("http://www.sunilos.com:8080/Home");

		System.out.println("Protocol : " + u.getProtocol());
		System.out.println("Host Name : " + u.getHost());
		System.out.println("Port Number : " + u.getPort());
		System.out.println("File Name : " + u.getFile());

		// Open input channel to read data
		InputStream istr = u.openStream();

		// Scanner will convert bytes into text
		Scanner in = new Scanner(istr);

		// Read text line by line from URL
		while (in.hasNext()) {
			String html = in.nextLine();
			System.out.println(html);
		}
		in.close();
	}

}
