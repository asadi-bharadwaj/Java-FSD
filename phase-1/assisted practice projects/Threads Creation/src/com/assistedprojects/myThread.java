package com.assistedprojects;
//creating thread by extending thread class
public class myThread extends Thread {
	public void run() {
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		myThread t1=new myThread();
		t1.start();
	}

}
