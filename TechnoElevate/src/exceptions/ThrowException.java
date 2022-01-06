package exceptions;

public class ThrowException {
	public void bhushan() {
		System.out.println("i did not do it");
		throw new ArrayIndexOutOfBoundsException();
	}
public static void main(String[] args) {
	System.out.println("who did it?");
	ThrowException ab = new ThrowException();
	ab.bhushan();
	
}
}
