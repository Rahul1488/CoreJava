package String;

import java.util.Scanner;

public class StringExample3 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter the first string");
		String myStr1 = a.next();
		System.out.println("enter the second string");
		String myStr2 = a.next();
		System.out.println("enter the third string");
		String myStr3 = a.next();
		System.out.println(myStr1.equals(myStr2));
		System.out.println(myStr1.equals(myStr3));
	}
}
