package has_a_relationship_assignment;

public class user {
public static void main(String[] args) {
	kitchen ob = new kitchen("funished", 250, "enginnered wood");
bathroom ob1 = new bathroom("jaguar", 3);
terrace ob2 = new terrace("yes", "yes", "not available");
room ob3 = new room("ventilated", "well furnished", "attached bathroom");
House ob4 = new House(10000000, ob, ob3, ob1, ob2);
System.out.println(ob4);
}
}
