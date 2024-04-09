 package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SplitFileExample {
	public static void main(String[] args) throws IOException {
		//find no of lines
		String s = "C:\\Users\\DELL\\Desktop\\gopal.txt";
		int count = 0;
		int nol =2;
		File f = new File(s);
  		Scanner sc = new Scanner(f);
		while(sc.hasNext()) {
			sc.next();
			count++;
		}
			System.out.println("No of lines=" + count);
		//no of  files
			int temp=count/nol;
			int rem = count%nol;
			int nof =0;
			if(temp!=0) {
				nof=temp;
				if(rem!=0) {
					nof++;
				}else {
					nof=temp;
				}
			}
			System.out.println("No of file = "+nof);
			
			//create files and write data
			BufferedReader br = new BufferedReader(new FileReader(s));
			String strline;
			for(int j=1; j<=nof; j++) {
				BufferedWriter bw = new BufferedWriter(
		new FileWriter("C:\\Users\\DELL\\Desktop\\gogo"+j+".txt"));
				strline = br.readLine();
				for(int i=0; i<=nol; i++) {
					if(strline != null) {
						bw.write(strline);
						strline=br.readLine();
						
						if(i!=nol) {
							bw.newLine();
						}
					}
		}	
				}
			
			
	}
}
