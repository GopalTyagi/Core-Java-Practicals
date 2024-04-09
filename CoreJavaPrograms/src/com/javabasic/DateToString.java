package com.javabasic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {
	public static void main(String[] args) {
		Date d = Calendar.getInstance().getTime();
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		String str = df.format(d);
		System.out.println(str);
	}

}
