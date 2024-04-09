package com.io;

import java.io.Console;
import java.util.Scanner;

public class ConsoleClassExample {
	public static void main(String[] args) {
		String username;
		String password;
		//Console con = System.console();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username : ");
		username = sc.next();

		System.out.println("Enter password : ");
		password = sc.next();
		String a = String.valueOf(password);

		System.out.println("Username = " + username);
		System.out.println("Password = " + password);
		//System.out.println("Password = " + a);

	}

}
