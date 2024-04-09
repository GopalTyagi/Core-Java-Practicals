package com.javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {

		String d = "23/02/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date date = sdf.parse(d);
		System.out.println(d + "\t" + "==  " + date);
	}

}
