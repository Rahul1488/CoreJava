package com.te.mock;

public class Royce extends Car{

	@Override
	public void start() {
		System.out.println("kick");
		
	}

	@Override
	public void accelerate() {
		System.out.println("fast");
		
	}

	@Override
	public void brake() {
		System.out.println("slowly");
		
	}
	

}
