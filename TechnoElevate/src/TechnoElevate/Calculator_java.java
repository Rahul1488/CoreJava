package TechnoElevate;

import java.util.Scanner;

public class Calculator_java {

	public static double addition(double a, double b) {
		double res1 = a + b;
		return res1;
	}

	public static double substraction(double a, double b) {
		double res2 = a - b;
		return res2;
	}

	public static double multi(double a, double b) {
		double res3 = a * b;
		return res3;
	}

	public static double division(double a, double b) {
		double res4 = a / b;
		return res4;
	}

	public static double GST(double a, double b) {
		double res5 = (b + (b * a / 100));
		return res5;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for subtraction");
		System.out.println("enter 3 for multi");
		System.out.println("enter 4 for division");
		System.out.println("enter 5 for GST calculation");
		System.out.println("select your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("enter the first number");
			double a = sc.nextInt();
			System.out.println("enter the second number");
			double b = sc.nextInt();
			System.out.println("addition of 2 number " + addition(a, b));
		}
			break;

		case 2: {
			System.out.println("enter the first number");
			double a = sc.nextInt();
			System.out.println("enter the second number");
			double b = sc.nextInt();
			System.out.println("substraction of 2 number " + substraction(a, b));
		}
			break;

		case 3: {
			System.out.println("enter the first number");
			double a = sc.nextInt();
			System.out.println("enter the second number");
			double b = sc.nextInt();
			System.out.println("multi of 2 number " + multi(a, b));
		}
			break;

		case 4: {
			System.out.println("enter the first number");
			double a = sc.nextInt();
			System.out.println("enter the second number");
			double b = sc.nextInt();
			System.out.println(" division of 2 number " + division(a, b));
		}
			break;
		case 5: {
			System.out.println("enter the percentage of GST");
			double a = sc.nextInt();
			System.out.println("enter the price of product");
			double b = sc.nextInt();
			System.out.println(" the sum after gst addition is  " + GST(a, b));
		}
			break;

		}
	}
}
