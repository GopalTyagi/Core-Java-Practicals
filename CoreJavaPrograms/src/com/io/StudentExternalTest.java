package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentExternalTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// Serialize
		StudentExternal s = new StudentExternal(12, "gopal");
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\DELL\\Desktop\\tyagi.txt"));
		out.writeObject(s);

		// Deserialize

		ObjectInputStream in = new ObjectInputStream(
		 new FileInputStream("C:\\Users\\DELL\\Desktop\\tyagi.txt"));
		s = (StudentExternal) in.readObject();
		System.out.println(s.getId());
		System.out.println(s.getName());

		out.close();
		in.close();
	}

}
