
package com.myio;

import java.io.File;
import java.sql.Date;

public class FileInfo {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\DELL\\Desktop\\gopal.txt");
		if(f.exists()) {
			System.out.println("Name = "+f.getName());
			System.out.println("Path = "+f.getPath());
			
			//check Access permissions 
			System.out.println("Writable = "+f.canWrite());
			System.out.println("Readable = "+f.canRead());
			
			//check if it is file o directory
			System.out.println("Is File = "+ f.isFile());
			System.out.println("Is directory = "+f.isDirectory());
	
			//last modified date of file/directory
			Date d = new Date(f.lastModified());
			System.out.println("Date of modification = " + d);
			
			//length of file
			long length = f.length();
			System.out.println("length = "+ length+" (bytes)");
			
			
		}else {
			System.out.println("File does not exists");
		}
	}
}
