package com.assistedprojects;

public class methodOverloading {
	public void area(int z, int y)
	{
		System.out.println("area of triangle"+(0.5*z*y));
	}
	public void area(int r) {
		System.out.println("area of circle:"+(3*r*r));
	}
	public static void main(String[] args) {
		methodOverloading obj=new methodOverloading();
		obj.area(10,12);
		obj.area(5);
	}
}
