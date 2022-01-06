package com.te.array;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the maximum limit");
		int size = sc.nextInt();

		long[] series = new long[size];
		series[0] = 0;
		series[1] = 1;
		for (int i = 2; i < series.length; i++) {
			series[i] = series[i - 1] + series[1 - 2];
		}
		for (int i = 0; i < series.length; i++) {
			System.out.println(series[i]);
		}
	}
}
