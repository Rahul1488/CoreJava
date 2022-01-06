package String;

import java.util.Scanner;

public class String_example2 {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("enter the first name");
	String firstName =a.next();
	System.out.println("enter the second name");
	String lastName =a.next();
	System.out.println(firstName.concat(lastName));
}
}
