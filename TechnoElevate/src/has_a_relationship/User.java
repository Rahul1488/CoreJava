package has_a_relationship;

public class User {

	public static void main(String[] args) {
		battery ob1 = new battery("toshibha", 5000, 5);
		operatings ob2 = new operatings("widows", 11, 64);
		hardDisk ob3 = new hardDisk("wd", 1, "SSD");
		processor ob4 = new processor("intel", 4, 65);
		Laptop ob5=new Laptop(69999, ob1, ob2, ob3, ob4);
		System.out.println(ob5);
	}

}
