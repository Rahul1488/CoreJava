package TechnoElevate;

public class Method_overloading {
public void login(String username,String password) {
	System.out.println("your user name is "+username);
	System.out.println("your user password is "+password);
}
public void login(String username,String password,long phoneNumber) {
	System.out.println("your user name is "+username);
	System.out.println("your user password is "+password);
	System.out.println("your user phone number is "+phoneNumber);
}
	public static void main(String[] args) {
	Method_overloading ob = new Method_overloading();
	ob.login("rahul", "8792328509");
	System.out.println("-----------");
	ob.login("rah", "879", 56246135263l);

	}

}
