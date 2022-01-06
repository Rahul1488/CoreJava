package encapsulation;

import java.util.logging.Logger;

public class Classroom {
	public static void main(String[] args) {
		
	

		Studenrt rahul = new Studenrt("rahul", 36, 80);
		
		rahul.setMarks(75);
		
		rahul.setMarks(95);

		System.out.println(rahul.name);
		System.out.println(rahul.Rollno);
		System.out.println(rahul.getMarks());
	}
}
