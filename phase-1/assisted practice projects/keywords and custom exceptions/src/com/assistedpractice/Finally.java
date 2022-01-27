package com.assistedpractice;

public class Finally {
	public static void main(String[] args) {
		try {
			int data =99/0;
			System.out.println(data);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block always executed");
		}
		System.out.println("rest of the programe");

}
}