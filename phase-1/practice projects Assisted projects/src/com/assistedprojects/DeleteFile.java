package com.assistedprojects;
import java.io.File;
public class DeleteFile {
	public static void main(String[] args) {
		try {
			File f=new File("E:\\");
			if(f.delete()) {
				System.out.println(f.getName()+"deleted");
			}
			else
			{
				System.out.println("failed");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
