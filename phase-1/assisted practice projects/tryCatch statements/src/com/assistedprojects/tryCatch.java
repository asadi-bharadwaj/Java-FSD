package com.assistedprojects;
public class tryCatch {
	public static void main(String[] args) {
		try {
			int data =25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block always executed");
		}
		System.out.println("rest of the code");
	}

}
