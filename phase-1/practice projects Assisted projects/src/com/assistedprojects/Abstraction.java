package com.assistedprojects;

//abstraction
abstract class Shape{
	abstract void draw();
}
class rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle1 extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
	
}
public class Abstraction {
	public static void main(String[] args) {
		Shape s=new Circle1();
		s.draw();
	}

}
