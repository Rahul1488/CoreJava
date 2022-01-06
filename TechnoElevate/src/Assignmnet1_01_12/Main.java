package Assignmnet1_01_12;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
	   public static void main(String[] args)
	    {
	        // Create ine LinkedList for Student object
	        LinkedList<Employee> List= new LinkedList<Employee>();
	        List.add(new Employee("Vikas",121,1.5));
	        List.add(new Employee("Vinay", 131, 3.5));
	        List.add(new Employee("Vishnu", 141, 0.1));
	        List.add(new Employee("Vaishak", 151, 2));
	        List.add(new Employee("Varun", 161, 10));
	  
	        // Print the Unsorted LinkedList
	        System.out.println("UnSorted List");
	        for (Employee s : List) {
	            System.out.println(s.experience + " " + s.Ename + " "
	                               + s.eid);
	        }
	        System.out.println();
	  
	        // sort in ascending order
	        Collections.sort(List);
	  
	        // Print the sorted LinkedList
	        System.out.println("Sorted List");
	        for (Employee s : List) {
	            // Print the sorted LinkedList
	            System.out.println(s.experience + " " + s.Ename + " "
	                               + s.eid);
	        }
	    }
	}

