package com.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloTCPServer {

	public static void main(String[] args) throws Exception {
		
		//Create a TCP server @port#1234
		ServerSocket server = new ServerSocket(1234);
		
		//Wait for client
		Socket client = server.accept();
		
		//open client input stream
		DataInputStream in = new DataInputStream(client.getInputStream());
		
		//open client output stream
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		
		//read greeting sent by client
		String greeting = in.readLine();
		System.out.println(greeting);
		
		//write greeting back to the client
		out.writeBytes("Hello Client\n");
		
		//close client connection
		client.close();
		
		//close server
		server.close();
	}
}
