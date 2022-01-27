package com.assistedprojects;

public class strings {
	public static void main(String[] args)
	{
		System.out.println("methods of string");
		//length of a string
		String sl=new String("hello world");
		System.out.println("length of string: "+sl.length());
		String sub=new String("new string");
		System.out.println(sub.substring(2));
		//compare
		String a="hello";
		String b="hii";
		System.out.println(a.compareTo(b));
		String c="";
		System.out.println(c.isEmpty());
		String d="bb";
		System.out.println(d.isEmpty());
		//conerting to lower case/upper case
		String e="bharadwaj";
		System.out.println(e.toUpperCase());
		System.out.println(e.toLowerCase());
		String f="india";
		//replace method
		String replace =e.replace(b,a );
		System.out.println(replace);
		//equals method
		String g="welcome";
		String h="welcome!";
		System.out.println(g.equals(h));
		//creating string buffer
		System.out.println("string buffer");
		StringBuffer b1=new StringBuffer("welcome to learning   ");
		b1.append("you are learning java");
		System.out.println(b1);
		//insert method
		b1.insert(0, 'w');
		System.out.println(b1);
		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);
		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

	    System.out.println(sb1.reverse());
        
		



		
		
	}

}
