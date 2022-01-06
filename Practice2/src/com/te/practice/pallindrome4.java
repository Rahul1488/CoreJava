package com.te.practice;

public class pallindrome4 {
public static void main(String[] args) {
	int num=12321;
	int temp=num;
	int rev=0;
	while(temp!=0)
	{
		rev=rev*10+temp%10;
		temp=temp/10;
	}
	if(num==rev)
	{
		System.out.println("its palli");
	}
}
}
