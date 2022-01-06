package project;

public class p11 
{
int eid;
float esal;
String ename;
public p11(int eid,float esal,String ename) 
{
	this.eid=eid;
	this.esal = esal;
	this.ename=ename;
}
	public static void main(String[] args)
	{
	p11 ob1 = new p11(113454,50000.054f,"Rahul");	
	System.out.println("eid"+ob1.eid);
	System.out.println("esal"+ob1.esal);
	System.out.println("e name "+ob1.ename);
		

	}
}
