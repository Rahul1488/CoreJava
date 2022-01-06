package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Company {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList();
		arrayList.add(new Employee(2, "Ranjitha", 20000));
		arrayList.add(new Employee(1, "Praveen", 50000));
		arrayList.add(new Employee(5, "vivek", 200500));
		arrayList.add(new Employee(3, "Venkat", 200));
		for (Employee e : arrayList) {
			System.out.println(e);
		}
		System.out.println("=================");

//		Collections.sort(arrayList);/this is for sorting using compareTo in comparable
		Collections.sort(arrayList, new SortBySalary());// this is use for sorting using comparator
		for (Employee e : arrayList) {
			System.out.println(e);
		}
	}
}
