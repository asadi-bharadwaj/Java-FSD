package com.assistedprojects;

class student{
	int id;
	String name;
	void display() {
	//Default constructor
	System.out.println(id+" "+name);
	}
	
}
public class defaultConstructor {
	public static void main(String[] args) {
		student s1=new student();
		s1.display();
	}
}
