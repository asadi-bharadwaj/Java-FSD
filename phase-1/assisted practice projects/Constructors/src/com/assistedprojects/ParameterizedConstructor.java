package com.assistedprojects;

public class ParameterizedConstructor {
	int id;
	String name;
	ParameterizedConstructor(int i,String n){
		id=i;
		name=n ;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		ParameterizedConstructor s1=new ParameterizedConstructor(111,"bharat");
		ParameterizedConstructor s2=new ParameterizedConstructor(121,"kingg");
		s1.display();
		s2.display();
		
	}
}

