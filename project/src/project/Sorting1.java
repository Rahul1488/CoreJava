package project;

import java.util.Scanner;

public class Sorting1 {
	public static void main(String[] args) {
		System.out.println("enter the number of elements that you want to enter");
		Scanner a = new Scanner(System.in);
		int size = a.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("the third largets number is"+arr[arr.length-3]);

	}
}
