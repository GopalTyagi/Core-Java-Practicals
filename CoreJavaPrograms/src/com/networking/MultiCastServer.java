package com.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastServer {
	public static void main(String[] args) throws IOException {
		MulticastSocket socket = new MulticastSocket(3336);
	
		//Setup group IP address
		InetAddress group = InetAddress.getByName("202.0.202.0");
		
		//Join the group
		socket.joinGroup(group);
		
		//create empty packet
		byte[] buf = new byte[256];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		
		//Receive broadcasted message
		socket.receive(packet);
		
		//Print message
		String received = new String (packet.getData());
		System.out.println("Message : "+received);
		
		//Leave the group
		socket.leaveGroup(group);
		
		//close the socket
		socket.close();
	
	}

}
