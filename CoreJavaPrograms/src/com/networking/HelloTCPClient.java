package com.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloTCPClient {
	public static void main(String[] args) throws Exception, IOException {
		
		//connect to server
		Socket client = new Socket("localhost",1234);
		
		//open client input stream
		DataInputStream in = new DataInputStream(client.getInputStream());
		
		//open client output stream
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		
		//write greetings to server
		out.writeBytes("Hello Server\n");
		
		//read greeting sent by server
		String greeting = in.readLine();
		System.out.println(greeting);
		
		//close connection with server
		client.close();
	}

}
