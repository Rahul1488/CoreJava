package com.te.ThreadUsingRunnableChangingName;
public class main {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread currentThread = Thread.currentThread();
		System.out.println("the name of the current thread is "+currentThread.getName());
		//the code to set name of the thread
		
}
}
