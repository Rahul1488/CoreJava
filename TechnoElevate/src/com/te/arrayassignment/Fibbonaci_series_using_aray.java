package com.te.arrayassignment;

import java.util.Scanner;

public class Fibbonaci_series_using_aray {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter the max limit");
		int limit = a.nextInt();

		long[] series = new long[limit];

		series[0] = 0;
		series[1] = 1;

		for (int i = 2; i < limit; i++) {
			series[i] = series[i - 1] + series[i - 2];
		}

		System.out.println("Fibonacci Series upto " + limit);
		for (int i = 0; i < limit; i++) {
			System.out.print(series[i] + " ");
		}
	}
}
