package exceptions;

public class ThrowsException  {
	public void bhushan()throws Exception {
		System.out.println("i did not do it");
		throw new Exception();
	}
public static void main(String[] args) {
	System.out.println("who did it?");
	ThrowException ab = new ThrowException();
	try{ab.bhushan();
	}
	catch (Exception e) {
		System.out.println("Exception occured");
	}
}
}
