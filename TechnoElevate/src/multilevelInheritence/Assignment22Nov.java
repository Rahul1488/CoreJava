package multilevelInheritence;

import java.util.Scanner;

public class Assignment22Nov {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of cases");
		int t = sc.nextInt();
		System.out.println("enter the first value");
		int a = sc.nextInt();
		System.out.println("enter the second value");
		int b = sc.nextInt();
		System.out.println("enter the number of series");
		int n = sc.nextInt();
		for (int i = 0; i < t; i++) {
			

			int sum = a;
			for (int j = 0; j < n; j++) {
				sum += b * Math.pow(2, j);
				System.out.print(sum + " ");
			}
			System.out.println();
		}
    }
}

