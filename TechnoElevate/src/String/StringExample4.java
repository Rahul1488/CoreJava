package String;

import java.util.Scanner;

public class StringExample4 {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("enter the string");
	String myStr =a.next();
	System.out.println(myStr.replace('l', 'p'));
}
}
