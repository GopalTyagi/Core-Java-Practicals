package com.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class HelloUDPClient {
	public static void main(String[] args) throws IOException {

		// Create UDP socket
		DatagramSocket socket = new DatagramSocket();

		byte[] buf = new byte[256];

		// Encapsulate Server's IP Address
		InetAddress address = InetAddress.getByName("127.0.0.1");

		// Create a new packet

		DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);

		// send packet
		socket.send(packet);

		// Create an empty data packet
		packet = new DatagramPacket(buf, buf.length);

		// wait for a packet and receive
		socket.receive(packet);

		// Convert to String
		String received = new String(packet.getData());
		System.out.println("Quote of the Moment : " + received);
		socket.close();

	}

}
