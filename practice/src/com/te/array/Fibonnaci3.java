package com.te.array;

import java.util.Scanner;

public class Fibonnaci3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the max length");
		int size=sc.nextInt();
		int []a=new int[size];
		 a[1]=1;
		 a[0]=0;
		for (int i =0; i < args.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 2; i < a.length; i++) {
			a[i]=a[i-1]+a[i-2];
		}
		for (int i = 0; i < size; i++) {
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
