package com.te.array;

import java.util.Scanner;

public class Sorting_char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		int size = sc.nextInt();
		System.out.println("enter the array charecter");
		String[] a = new String[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j]) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
