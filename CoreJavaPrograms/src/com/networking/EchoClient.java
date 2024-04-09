
package com.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//Connect to server
		Socket cSocket = new Socket("127.0.0.1",4444);
		
		//Open client writer
		PrintWriter out = new PrintWriter(cSocket.getOutputStream(),true);
		
		//Open client reader
		BufferedReader in = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
		System.out.println("Client Started");
		
		//Open Keyboard reader
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		//Read line from KeyBoard
		String line = stdIn.readLine();
		while(line !=null) {
			//write text to server
			out.println(line);
			
			//Received echo String from server
			System.out.println("Echo : "+in.readLine() );
			if("Bye".equals(line)) {
				break; //Break loop
			}
			line =stdIn.readLine();  //next line
		}
		out.close();
		in.close();
		stdIn.close();
		cSocket.close();
		
		
	}
}
