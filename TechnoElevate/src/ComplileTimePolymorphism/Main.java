package ComplileTimePolymorphism;

public class Main {
	public static void main(String[] args) {
		test ob=new test();
		ob.m1();
		System.out.println(ob.x);
		System.out.println("========");
		Demo ob1=new Demo();
		ob1.m1();
		System.out.println(ob1.x);System.out.println("==============");
		test t=new Demo();
		t.m1();
		System.out.println(t.x);
		
	}
}
