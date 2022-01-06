package encapsulation;

public class Employee {
private int empId;
private int age;
private String name;
private static String designation;
public void setAge(int age)
{
if(age>0&&age<100)
{
this.age=age;
}
else 
{
System.out.println("Foolish guy dont test me");	
}

}
public void getAge() {
	System.out.println(age);
}
public void setempId(int empId)
{
this.empId=empId;	
}
public void getempID()
{
System.out.println(empId);	
}
public void getName() {
	System.out.println(name);
}
public void setName(String name) {
	this.name = name;
}
public static void getDesignation() {
	System.out.println(designation);;
}
public static void setDesignation(String designation) {
	Employee.designation = designation;
}



}
