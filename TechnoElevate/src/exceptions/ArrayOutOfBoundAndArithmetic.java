package exceptions;

import java.util.Scanner;

public class ArrayOutOfBoundAndArithmetic {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = scan.nextInt();
		System.out.println("enter the second number");
		int b = scan.nextInt();
		try {
			int result =a/b;
			int []arr=new int[result];
			arr[4]=50;
			System.out.println(arr[4]);
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("rahul");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("array length is small");
		}
}
}
