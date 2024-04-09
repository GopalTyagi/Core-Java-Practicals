package com.networking;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWriter {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.sunilos.com:8080/Home");

		String question = "java";

		// Create URLConnection object
		URLConnection conn = url.openConnection();

		// Inform URLConnection object for
		// writing parameters
		conn.setDoOutput(true);

		// Open output stream
		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());

		// Write question parameter
		out.write("Q = " + question);

		// Close output stream
		out.close();

		// Connect to the server
		conn.connect();

		// Open input channel to read data
		InputStream istr = conn.getInputStream();

		// Scanner will convert bytes into text
		Scanner in = new Scanner(istr);

		System.out.println("URL contents *** ");

		// Read text line by line from URL
		while (in.hasNext()) {
			String html = in.nextLine();
			System.out.println(html);
		}
		in.close();

	}
}
