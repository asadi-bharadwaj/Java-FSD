package com.assistedprojects;
class table{
	synchronized void printTable(int n) {
		//synchronised method
		for(int i=1;i<5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class myThread1 extends Thread{
	table t;
	myThread1(table t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
}
class myThread2 extends Thread{
table t;
myThread2(table t){
	this.t=t;
}
public void run() {
	t.printTable(100);
}
}
public class Synchronization {
	public static void main(String[] args) {
		table obj=new table();
		myThread1 t1=new myThread1(obj);
		myThread2 t2=new myThread2(obj);
		t1.start();
		t2.start();
	}

}
