package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerialTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// Serialize
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("D://serialout.txt"));
		StudentSerial s = new StudentSerial(1, "gopal");
		o.writeObject(s);
		System.out.println("hm");
		o.close();

		// DeSerialize

		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("D://serialout.txt"));
		s = (StudentSerial) in.readObject();
		System.out.println(s.getName());

	}

}
