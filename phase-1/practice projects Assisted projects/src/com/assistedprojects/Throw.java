package com.assistedprojects;

public class Throw {
	public static void validate(int age) {
		try {
		if(age<18) {
			throw (new ArithmeticException ("person is not eligible to vote"));
		}
		else
			System.out.println("person is eligible to vote");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		validate(13);
		System.out.println("rest of the code");
	}

}
