package com.te.array;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		System.out.println("enter the array elements");
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j])
				{
						int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		for (int z = 0; z < a.length; z++) {
			System.out.println(a[z]);
		}
		System.out.println(a[size - 3]);
		System.out.println(a[0]);
	}
}
