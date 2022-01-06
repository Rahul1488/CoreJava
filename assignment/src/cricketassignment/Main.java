package cricketassignment;

import java.util.HashSet;

public class Main  {


	public static void main(String[] args) {
		HashSet<TeamClass> set = new HashSet<>();
		set.add(new TeamClass(333, "Chris Gayle", 40, 1));
		set.add(new TeamClass(3, " Jacque Khallis", 35, 2));
		set.add(new TeamClass(18, " Virat Kholi", 34, 3));
		set.add(new TeamClass(17, " Abraham Benjamin Develliers", 36, 4));
		set.add(new TeamClass(5, "Glenn Maxwell", 30, 5));
		set.add(new TeamClass(1, "Konnur Lokesh Rahul", 28, 6));
		set.add(new TeamClass(8, "Anil Kumble", 38, 7));
		set.add(new TeamClass(3, "Yuzi Chahal", 32, 8));
		set.add(new TeamClass(8, "Mohammed Siraj", 28, 9));
		set.add(new TeamClass(5, "Zaheer Khan", 35, 10));
		set.add(new TeamClass(11, "Harshal Patel", 28, 11));
		for (Object x : set) {
			System.out.println(x);
		}
		System.out.println("============");
		set.add(new TeamClass(8009, "Muttaiyah MuraliDharan", 28, 11));
		for (Object x : set) {
			System.out.println(x);
		}
	}
}
