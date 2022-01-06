package project;

public class p7 extends p6
{
int j=20;
public void test2()
{
	System.out.println("from test 2");
	}
	public static void main(String[] args) {
		p7 ob1=new p7();
		ob1.test1();
		ob1.test2();
System.out.println(ob1.a);
System.out.println(ob1.j);
System.out.println();
	}

}
