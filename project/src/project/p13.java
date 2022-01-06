package project;

public class p13 
{
	int eid;
	String ename;
	private float esal;
	public float esal()
	{
		return this.esal();
	}
	public p13(int eid,String ename,float esal) 
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	public static void main(String[] args)
	{
		p13 ob1=new p13(11354,"Rahul",150000.55f);
        System.out.println("eid:"+ob1.eid);
        System.out.println("ename"+ ob1.ename);
        System.out.println("esal"+ob1.esal);
	}

}
