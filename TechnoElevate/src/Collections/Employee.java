package Collections;

public class Employee implements Comparable<Employee> {
	int empId;
	String name;
	double salary;

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ArrayList [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
	
		return (int) (o.salary-this.salary);//if u need to sort from ascending order use this.empid-o.empid
	}
	

	

}
