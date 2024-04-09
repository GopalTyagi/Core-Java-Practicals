package com.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class MultiCastClient {
	public static void main(String[] args) throws IOException {
		// Start server at port 4446
		DatagramSocket socket = new DatagramSocket(4446);

		// Group information
		InetAddress groupIP = InetAddress.getByName("202.0.202.0");
		int groupPort = 3336;

		byte[] msg = "Good Morning".getBytes();

		// Create a packet for group
		DatagramPacket packet = new DatagramPacket(msg, msg.length, groupIP, groupPort);

		// Broadcast message to group
		socket.send(packet);
		socket.close();
	}

}
