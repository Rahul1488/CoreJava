package com.te.mock;

public abstract  class bike {
 abstract void sound();
 abstract void horn();
 abstract void braking();
 String engine;
 int power;
public bike(String engine, int power) {
	super();
	this.engine = engine;
	this.power = power;
}
 
 
}
