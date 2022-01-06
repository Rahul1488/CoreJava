package exceptions;

import java.util.Scanner;

public class ArithmeticExceptionWork{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = scan.nextInt();
		System.out.println("enter the second number");
		int b = scan.nextInt();
		
try {
	int result = a / b;
	System.out.println(result);
			
		} catch (ArithmeticException e) {
			System.out.println("Infinite");
		}
	}
}
