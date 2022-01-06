package com.te.array;

import java.util.Scanner;

public class StringPallindrome {
	public static void main(String[] args) {
		String rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String a = sc.nextLine();
		
		for (int i = a.length() - 1; i >= 0; i--) {
			 rev = rev+a.charAt(i);
		}
		if(a.equals(rev))
		{
			System.out.println("its pallindrome");
		}
		else
		{
			System.out.println("its not a pallindrome");
		}
		}
			
		

	}

