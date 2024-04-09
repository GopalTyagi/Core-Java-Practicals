package com.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {

		// Start Server @port#4444
		ServerSocket sSocket = new ServerSocket(4444);
		System.out.println("Server Started");

		Socket cSocket = null;
		boolean flag = true;
		while (flag) { // Infinite loop
			cSocket = sSocket.accept(); // Receive client
			talk(cSocket);

		}
		// Closing Server
		sSocket.close();
		System.out.println("Server Closed ");
	}

	// Talk to the client
	static void talk(Socket cSocket) throws IOException {
		// Open client writer
		PrintWriter out = new PrintWriter(cSocket.getOutputStream(), true);
		// Open client reader
		BufferedReader in = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));

		// Read text from Client
		String line = in.readLine();

		while (line != null) {
			System.out.println("Server Received : " + line);
			out.println(line + ".." + line); // Echo
			if (line.equals("Bye")) {
				break; // Break loop
			}
			line = in.readLine(); // Read next line
		}
		out.close();
		in.close();
		cSocket.close(); // close client

	}
}
