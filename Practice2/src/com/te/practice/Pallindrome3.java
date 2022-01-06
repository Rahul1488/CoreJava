package com.te.practice;

public class Pallindrome3 {
public static void main(String[] args) {
	int num=1221;
	int temp=num;
	int rev=0;
	while(num!=0)
	{
		rev=rev/10+temp%10;
		temp=temp/10;
	}
	if(num==rev)
	{
		System.out.println("its palli");
	}
	
}
}
