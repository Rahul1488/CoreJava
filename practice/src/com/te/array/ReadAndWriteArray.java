package com.te.array;

import java.util.Scanner;

public class ReadAndWriteArray {
	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("enter the array size");
		int size=a.nextInt();
		System.out.println("enter array elements");
		int []b= new int[size];
		for (int i = 0; i < b.length; i++) {
			b[i]=a.nextInt();
		}
		int sum=0;
		for (int i = 0; i < b.length; i++) {
			sum=sum+b[i];
		}
		System.out.println("the sum of array is "+sum);
		

	}
}
