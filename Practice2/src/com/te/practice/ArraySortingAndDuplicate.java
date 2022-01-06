package com.te.practice;

import java.util.Scanner;

public class ArraySortingAndDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		System.out.println("enter the size of the array");
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int j = 0;
		System.out.println("the elements after sorting are");
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		for (int i = 0; i < j; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println(a[size-1]);
	}
}
