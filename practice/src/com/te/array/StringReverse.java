package com.te.array;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		char[] b = a.toCharArray();
		for (int i = b.length; i >= 0; i++) {
			System.out.println(a[i]);
		}
}
}