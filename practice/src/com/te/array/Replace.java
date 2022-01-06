package com.te.array;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			boolean repeated = false;
			for (int j = i +1; j < a.length; j++) {
				if (a[i] == a[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated)
			{
			System.out.println(a[i]);	
			}
		}
	}
}
