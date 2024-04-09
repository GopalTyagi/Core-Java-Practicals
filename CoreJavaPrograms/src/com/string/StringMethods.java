package com.string;

public class StringMethods {
	public static void main(String[] args) {

		String s = "Kumar";
		String s1 = "Gopal Kumar Tyagi";
		String s2 = new String("Gopal Kumar Tyagi");
		String sa = s1;

		String sb = s.toUpperCase();
		// System.out.println(s1.replaceAll("K", "T"));
		// System.out.println(s1.equals(s2));
		// System.out.println(s.indexOf("a"));
		// System.out.println(s2.toUpperCase());

		// System.out.println(s1==s2);
		// System.out.println(sa);
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(1, 12));
		System.out.println(s1.subSequence(3, 10));
		System.out.println(s1.matches(s2));
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.charAt(8));
		System.out.println(s1.indexOf("k"));
		System.out.println(s1.lastIndexOf("a", 12));
		/*
		 * System.out.println(s1.contains(s2)); System.out.println(s2.compareTo(s1));
		 * System.out.println(s2.compareToIgnoreCase(s1)); System.out.println(s.trim());
		 * System.out.println(s.join(s1, "pal")); System.out.println(s.length());
		 * System.out.println(s.isEmpty()); System.out.println(s.codePointAt(0));
		 * System.out.println(s.codePointAt(5)); System.out.println(s.codePointCount(2,
		 * 7)); System.out.println(s.valueOf(5)); System.out.println(s2.toString());
		 * System.out.println(s.toLowerCase()); System.out.println(s1.toUpperCase());
		 * System.out.println(s.startsWith("K")); System.out.println(s1.hashCode());
		 * 
		 * String ss = String.join("^^", "you", "are", "Awesome");
		 * System.out.println(ss); String s3[] = s1.split("K"); for (int i = 0; i <
		 * s3.length; i++) { System.out.println("spilit  == " + s3[i]); }
		 */
	}

}
