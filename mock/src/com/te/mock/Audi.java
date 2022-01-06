package com.te.mock;

public class Audi extends Car {

	@Override
	public void start() {
		System.out.println("push");
		
	}

	@Override
	public void accelerate() {
		System.out.println("slow");
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("hard");
	}

}
