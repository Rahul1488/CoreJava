package String;

public class StringWork {
	public static void main(String[] args) {
		String name = "my name is rahul";
		name = name.toUpperCase();
		System.out.println(name.length());
		System.out.println(name);
		System.out.println(name.equals(name));
		String[] s = name.split(" ", 4);// as the first word is for where to split and second one is how many number of
										// time to split
		for (String x : s) {
			System.out.println(x);
		}

	}
}
