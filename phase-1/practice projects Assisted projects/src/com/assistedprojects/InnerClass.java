package com.assistedprojects;

public class InnerClass {

	 private String msg="outer class"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+"     inner class");}  
	 }  


	public static void main(String[] args) {
		InnerClass obj=new InnerClass();
		InnerClass.Inner in=obj.new Inner();  
		in.hello();  
	}
}

	


