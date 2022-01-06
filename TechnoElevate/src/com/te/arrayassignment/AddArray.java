package com.te.arrayassignment;

import java.util.Scanner;

public class AddArray {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter the number of size");
		int size = a.nextInt();
		int array[] = new int[size];
		int sum = 0;
		System.out.println("enter the elements of array");
		for (int i = 0; i < size; i++) {
			array[i] = a.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("the sum is "+sum);
	}
}
