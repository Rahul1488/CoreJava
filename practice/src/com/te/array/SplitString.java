package com.te.array;

public class SplitString {
	public static void main(String[] args) {
		String name = "hello techno yantra";
		String[] a = name.split(" ", 3);

		for (String x : a) {
			System.out.println(x);
		}
	}
}
