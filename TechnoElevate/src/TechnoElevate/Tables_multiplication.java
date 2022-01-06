package TechnoElevate;

import java.util.Scanner;

public class Tables_multiplication {
	public static void main(String[] args) {
		int answer=0;
	Scanner	sc=new Scanner(System.in);
	System.out.println("enter the number to perform operation on tables");
		int a=sc.nextInt();
		System.out.println("enter the range you need");
		int b=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int z=a*i;
			System.out.println(a+"*"+i+"="+z);
			answer=z+answer;
			if(answer>=b)
			{
			break;
			}
			
			
		}
		
		System.out.println("the sum of the tables is "+answer);
	
	}

}
