
package com.te.mock;

public class Enfield extends bike {
	public Enfield(String engine, int power) {
		super(engine, power);
	}

	@Override
	void sound() {
		System.out.println("loud sound");

	}

	@Override
	void horn() {
		System.out.println("low sound");

	}

	@Override
	void braking() {
		System.out.println("too low");

	}

	public static void main(String[] args) {
		Enfield a = new Enfield("twin spark", 350);
		System.out.println(a.engine);
		System.out.println(a.power);
		a.braking();
		a.horn();
		a.sound();
	}

}
