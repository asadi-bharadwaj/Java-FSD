package com.assistedprojects;

public class myRunnableThread implements Runnable {
	public void run() {
		System.out.println("thread is running");
		
	}
	public static void main(String[] args) {
		myRunnableThread t1=new myRunnableThread();
		Thread t=new Thread (t1);
		t.start();
	}

}
