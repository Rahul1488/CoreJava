package encapsulation;

public class Admin {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setempId(1);
		employee1.setName("rah");
		employee1.setAge(-19);
		employee1.setDesignation("software engineer");
		Employee employee2 = new Employee();
		employee2.setempId(1);
		employee2.setName("asd");
		employee2.setAge(22);
		employee2.setDesignation("software engineer");
		employee2.getempID();
		employee2.getName();
		employee2.getAge();
		employee2.getDesignation();
		System.out.println("====");
		employee1.getempID();
		employee1.getName();
		employee1.getAge();
		employee1.getDesignation();
		System.out.println("======");

	}

}
