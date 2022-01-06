package com.te.array;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		
		int a = 121;
        int temp=a;
        int rev=0;
        while(temp!=0)
        {
        	rev=rev*10+temp%10;
        	
        	temp=temp/10;
        }
        if(rev==a)
        {
        	System.out.println("its palli");
        }
        else
        {
        	System.out.println("its not palli");
        }
	}
}
