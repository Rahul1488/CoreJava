package com.te.LooseCoupling2;

public class Audi implements Car {

	@Override
	public void aceelerate() {
		// TODO Auto-generated method stub
		System.out.println("Automatic acceleration");
		
	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		System.out.println("low breaking");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Keyless");
		
	}

}
