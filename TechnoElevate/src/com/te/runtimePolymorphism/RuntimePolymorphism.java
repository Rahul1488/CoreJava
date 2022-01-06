package com.te.runtimePolymorphism;

public class RuntimePolymorphism {
	public static void calculatesum(int i, int j) {
		System.out.println("sum is " + (i + j));
	}

	public static void calculatesum(float i, int j) {
		System.out.println("sum is " + (i + j));
	}

	public static void calculatesum(float i, double j) {
		System.out.println("sum is " + (i + j));
	}

	public static void main(String[] args) {

		calculatesum(5, 50);
		calculatesum(55.55f, 50);
		calculatesum(55.55f, 50.55);
	}

}
