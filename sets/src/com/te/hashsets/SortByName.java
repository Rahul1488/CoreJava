package com.te.hashsets;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {//overidden for name 
		
		return o1.name.compareTo(o2.name);
	}

//	@Override
//	public int compare(Student o1, Student o2) {//over ridden for marks
//		
//		return o1.marks-o2.marks;
//	}
	

}
