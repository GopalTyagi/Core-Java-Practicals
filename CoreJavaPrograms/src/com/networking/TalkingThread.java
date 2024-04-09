package com.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TalkingThread extends Thread {

	private Socket client = null;

	public TalkingThread(Socket client) {
		this.client = client;
	}

	public void run() {
		try {
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String inputline = in.readLine();
			while (inputline != null) {
				System.out.println("Server Received " + inputline);
				out.println(inputline + " ... " + inputline);
				if (inputline.equals("Bye"))
					break;
				inputline = in.readLine();
			}
			out.close();
			in.close();
			client.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(4444);
		Socket clientSocket = null;

		boolean flag = true;
		while (flag) {
			clientSocket = server.accept();
			TalkingThread t = new TalkingThread(clientSocket);
			t.start();
		}
		System.out.println("Echo Server Stopped");
		server.close();
	}

}
