package interface1;

public class InterfaceB implements InterfaceA {

	@Override
	public void test1() {
		System.out.println("hi Techno elevate");
		
	}
public static void main(String[] args) {
	InterfaceB ob=new InterfaceB();
	ob.test1();
}
}
