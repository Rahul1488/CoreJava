package String;

import java.util.Scanner;


public class StringExample {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter the string");
		String r =a.nextLine();
		System.out.println("enter the position where you need to find charecter");
		int i=a.nextInt();//Am getting thread main exception if i use space while reading it
		char result = r.charAt(i);
		System.out.println(result);
	}
}

