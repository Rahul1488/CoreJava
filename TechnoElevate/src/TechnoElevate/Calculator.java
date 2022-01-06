package TechnoElevate;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the operator");
	String ch=sc.next();
	System.out.println("enter the first value");
	double a=sc.nextDouble();
	System.out.println("enter the second value");
	double b=sc.nextDouble();
	if(ch=="+") 
	{
	double c=a+b;
	System.out.println("the sum of two numbers is "+c);
	}
	 if(ch=="-")
	{
	double d=a-b;
	System.out.println("the diffrence of two number is "+d);
	}
	 if(ch=="*")
	{
		double e=a*b;
		System.out.println("the product of two number is "+e);
	}
	 if (ch=="/")
	{
		double f=a/b;
		System.out.println("the divisor of two number is "+f);
	}
	else
	{
		System.out.println("enter the appropriate opperator");
	}

	}

}
