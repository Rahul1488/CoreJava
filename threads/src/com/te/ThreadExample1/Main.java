package com.te.ThreadExample1;

public class Main {
	public static void main(String[] args) {
		Demo demo = new Demo();
	//	demo.run();//this is for execution flow by flow
		demo.start();//this is for thread execution
		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);//this thread.sleep i have written to check the speed of the execution in both main and demo class 
			} catch (InterruptedException e) {//as how the thread is working
				
				e.printStackTrace();
			}

		}
	}
}
