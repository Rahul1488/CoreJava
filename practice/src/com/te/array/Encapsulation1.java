package com.te.array;

public class Encapsulation1 {
	int eid;
	private double sal;
	String ename;
	public double getsal() {
		return this.sal;
	}
	
public Encapsulation1(int eid, double sal, String ename) {
		super();
		this.eid = eid;
		this.sal = sal;
		this.ename = ename;
	}


public static void main(String[] args) {
	 Encapsulation1 ob = new Encapsulation1(515, 50.2, "rah");
	 System.out.println(ob.eid);
	 System.out.println(ob.ename);
	 System.out.println(ob.sal);
}
}
