package com.assistedprojects;

import java.io.FileOutputStream;
import java.util.Scanner;
public class CreateNewFile
{
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the file name");
			String name=sc.nextLine();
			FileOutputStream fos=new FileOutputStream(name,true);
			System.out.println("enter the file content");
			String str=sc.nextLine();
			byte[] b=str.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("file created");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
    
    
}
