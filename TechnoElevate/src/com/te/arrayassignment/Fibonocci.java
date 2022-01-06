package com.te.arrayassignment;

import java.util.Scanner;

public class Fibonocci {
public static void main(String args[])
{
	int fn=0,sn=1,nn=0,num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	num=sc.nextInt();
	System.out.print(fn +" , "+sn);
	
	while(nn<num)
	{
		nn=fn+sn;
		if(nn<=num)
		{	
			System.out.print(" , "+nn);
			fn=sn;
			sn=nn;
		}
		else
			break;
	}
	
}

}

