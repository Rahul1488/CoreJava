package com.te.acessspecifier;

public class Method_overloading2 {

	public void add(int x, int y) {
		System.out.println(x + y);

	}

	public void add(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	public static void main(String[] args) {
		Method_overloading2 ob = new Method_overloading2();
		ob.add(5, 06);
		ob.add(5, 05, 07
				);
	}

}
