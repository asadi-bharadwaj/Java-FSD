package com.assistedprojects;

class accessSpecifier1{
	public void run()
	{
		System.out.println("this is private access Specifier");
	}
}
public class privateAccessSpecifier {
	public static void main(String[] args) {
		System.out.println("private access specifier");
		accessSpecifier1 obj=new accessSpecifier1();
		
	}

}
