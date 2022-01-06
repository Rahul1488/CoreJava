package com.te.ThreadUsingRunnableChangingName;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("the name of the current thread is "+Thread.currentThread().getName());
		System.out.println("the id of current  thread is"+Thread.currentThread().getId());
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
}
