package com.assistedprojects;

class defaultAccessSpecifier{
	void display() {
		System.out.println("this is default access specifier");
	}
}
public class accessSpecifiers {
	public static void main(String[] args) {
		System.out.println("default access specifier");
		defaultAccessSpecifier obj=new defaultAccessSpecifier();
		obj.display();
	}
	
}