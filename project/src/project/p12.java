package project;

import java.util.Scanner;

public class p12 
{
	public static void main(String[]args) {
		System.out.println("enter eid");
	Scanner scan =new Scanner(System.in);
    int eid=scan.nextInt();
    {
    if(eid==9507)
    {
    	System.out.println("the employee name is rahul");
    	System.out.println("the employee sal is software engineer");
    	System.out.println("position of the employee is Project lead");
    }
    else if (eid==4425)
    {
    	System.out.println("the employee name is Tez");
    	System.out.println("the employee sal is software engineer");
    	System.out.println("position of the employee is Trainee");	
    }
    else if (eid==1448)
    {
    	System.out.println("the employee name is keer");
    	System.out.println("the employee sal is software engineer");
    	System.out.println("position of the employee is student");	
    }
    else
    {
    	System.out.println("enter valid details");
    }

}}}