package loose_coupling;

import java.util.Scanner;

public class Owner {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Scanner scan = new Scanner(System.in);
		System.out.println("Shreyas Boss which car should I bring???");
		String s = scan.next();
		driver.driver(s);
	}

}
