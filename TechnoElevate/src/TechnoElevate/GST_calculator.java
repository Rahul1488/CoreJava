package TechnoElevate;

import java.util.Scanner;

public class GST_calculator {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the % of gst ");
		double i=sc.nextDouble();
		System.out.println("enter the price of the item");
		double j= sc.nextDouble();
		double z=(j+(j*i/100));
		System.out.println("the final price of the item after adding GST is :"+z);
		

	}

}
