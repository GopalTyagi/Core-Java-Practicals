package com.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class HelloUDPServer {
	public static void main(String[] args) throws IOException  {

		String[] quotes = { "Bura mat dekho", "Bura mat kaho", "Bura mat suno" };

		// Start UDP socket@port#4445
		DatagramSocket socket = new DatagramSocket(4445);

		// Create a byte buffer
		byte[] buf = new byte[256];

		// Create an empty data packet
		DatagramPacket packet = new DatagramPacket(buf, buf.length);

		boolean flag = true;
		while (flag) {
			// Wait and receive a packet
			socket.receive(packet);

			// Get Sender IP Address
			InetAddress address = packet.getAddress();

			// Get Sender's port number
			int port = packet.getPort();

			// Get random index number between 0 to 2
			int ind = (int) (Math.random() * 2);
			// Get random quote
			byte[] quote = quotes[ind].getBytes();

			// Create a new packet with qoute
			DatagramPacket qoutePkt = 
					new DatagramPacket(quote, quote.length, address, port);

			// Send packet
			socket.send(qoutePkt);
		}
		socket.close();
	
	}

}
