package cricketassignment;

public class TeamClass {
	int num;
	String name;
	int age;
	 int count;

	public static void check(int count) {
		if (count > 11) {
			throw new ImproperFunction("Can't add Player more than 11!");
		}
	}

	public TeamClass(int num, String name, int age, int count) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.count = count;
	}

	@Override
	public String toString() {
		return "TeamClass [num=" + num + ", name=" + name + ", age=" + age + ", count=" + count + "]";
	}

}
