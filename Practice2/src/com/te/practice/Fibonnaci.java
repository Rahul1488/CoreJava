package com.te.practice;

import java.util.Scanner;

public class Fibonnaci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the maximum sixe of elements");
	int size=sc.nextInt();
	int []a=new int [size];
	
	a[0]=0;
	a[1]=1;
	for (int i = 2; i < a.length; i++) {
		 a[i]=a[i-1]+a[i-2];
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
}
}
