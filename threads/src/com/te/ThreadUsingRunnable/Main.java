package com.te.ThreadUsingRunnable;

public class Main {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();//class type object
		Thread thread = new Thread(myThread);//parent type object to run start method because start is present in thread and run is present in runnable
		thread.start();
		System.out.println("hello thread");
	}
}
