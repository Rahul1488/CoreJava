package com.technoelevate.java_training;

public class p2 extends p1{
	int a;
	int b;
p2(int a,int b,int x,int y)
	{
		super(x,y);
		this.a=a;
		this.b=b;
	
	}

	public static void main(String[] args) {
		p2 abc = new p2(1,2,3,4);
		System.out.println(abc.a);
		System.out.println(abc.b);
		System.out.println(abc.x);
		System.out.println(abc.y);

	}

}
