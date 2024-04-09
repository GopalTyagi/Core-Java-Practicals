package com.exception;

public class BlogProgrammeTest {
	public static void main(String[] args) {
		System.out.println(test());
	}

	private static int test() {
		int k = 5;
		String name = "gopal";
		try {
			System.out.println(name.charAt(6));
			System.out.println(name.length());
			int i = 15 / k;
			System.out.println(i);
		} catch (StringIndexOutOfBoundsException e) {

			System.out.println(e.getMessage());
			System.out.println("String abhi choti he");
			return 10;

		} catch (RuntimeException e) {
			System.out.println("Cought by Parent " + e.getMessage());
			return 15;
		}finally {
			System.out.println("this is fnallly");
			return 20;
		}
	//	return 100;
	}

}
