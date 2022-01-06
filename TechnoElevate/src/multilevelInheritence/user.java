package multilevelInheritence;

public class user {

	public static void main(String[] args) {
		MessegeRead ob = new MessegeRead();
		ob.text();
		ob.Messegerecived();
		ob.Messegeread();
		System.out.println("=========");
		MessegeRecived ob1 = new MessegeRecived();
		ob1.text();
		ob1.Messegerecived();
		

	}

}
