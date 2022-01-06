package exceptions;

public class ExceptionExample {
	private static void m1() {
		System.out.println("from m1");
		m1();
	}

	public static void main(String[] args) {
		m1();
	}
}
