package com.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientThread {
	public static void main(String[] args) throws Exception {
		Socket echoSocket = new Socket("127.0.0.1", 4444);
		PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String userinput = stdin.readLine();
		while (userinput != null) {
			out.println(userinput);
			System.out.println("Echo: " + in.readLine());
			if ("Bye".equals(userinput)) {
				break;
			}
			userinput = stdin.readLine();
		}
		echoSocket.close();
	}

}
