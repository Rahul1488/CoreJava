package Assignment23Nov;

public class Senior__Developer extends Developer2{

	public Senior__Developer(int eid, String ename, double esal) {
		super(eid, ename, esal);
		
	}

	public static void main(String[] args) {
		Senior__Developer ob = new Senior__Developer(115544, "rah", 5455545121.25);
         System.out.println(ob.ename);

	}

}
