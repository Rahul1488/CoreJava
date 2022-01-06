package Up_casting_Down_casting;

public class test2 extends test {
	public void m1() {
		System.out.println("from test2");
		super.m1();
		
	}
	public static void m2() {
		System.out.println("from static of test2");
	}
}
