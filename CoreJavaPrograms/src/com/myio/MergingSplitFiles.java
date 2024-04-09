package com.myio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergingSplitFiles {
	public static void main(String[] args) throws IOException {
		FileReader f1 = new FileReader("C:\\Users\\DELL\\Desktop\\gogo.txt");
		BufferedReader br1 = new BufferedReader(f1);

		FileReader f2 = new FileReader("C:\\Users\\DELL\\Desktop\\gogo1.txt");
		BufferedReader br2 = new BufferedReader(f1);

		String line1 = br1.readLine();
		String line2 = br2.readLine();

		FileWriter fw = new FileWriter("C:\\Users\\DELL\\Desktop\\gopal1.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		while (line1 != null) {
			fw.write(line1);
			line1 = br1.readLine();
		}
		while (line2 != null) {
			fw.write(line2);
			line2 = br2.readLine();
		}
		fw.close();
		f1.close();
		f2.close();
		System.out.println("Files Merged");

	}

}
