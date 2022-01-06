package project;

public class p16 
{
int a=50;
static int b;
public static void test() {
	
	System.out.println(b);
}
public p16(int g) 
{
System.out.println(g);	
}

	public static void main(String[] args)
	{
		p16 ob1 = new p16(5000);
        System.out.println(ob1.a);
	ob1.test();
	}

}
