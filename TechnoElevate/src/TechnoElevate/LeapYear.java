package TechnoElevate;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("enter the year");
		System.out.println("enter the month");
		int i = a.nextInt();
		int j = a.nextInt();
		if (i % 4 == 0 && i % 100 != 0) {
			System.out.println(i + " it is a leap year ");
		} else if (i % 400 == 0) {
			System.out.println(i + " it is a leap year ");
		}

		else {
			System.out.println(i + " the year is not a leap year");
		}
		if (j <= 7 && j != 2) {
			if (j % 2 != 0) {
				System.out.println("the month has 31 days");
			} else {
				System.out.println("the month has 30 days ");
			}

		} else if (j >= 8 && j <= 12) {
			if (j % 2 == 0) {
				System.out.println("the month has 31 days ");
			} else {
				System.out.println("the month has has 30 days");
			}
		} else if (j == 2 && i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
			System.out.println("the month has 29 days");
		} else {
			System.out.println("the month has 28 days");
		}
	}

}
