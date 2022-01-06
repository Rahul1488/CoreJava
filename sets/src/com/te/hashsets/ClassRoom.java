package com.te.hashsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ClassRoom {
	public static void main(String[] args) {

		Student student1 = new Student(31, "vivek", 65);
		Student student2 = new Student(41, "sidd", 85);
		Student student3 = new Student(41, "bhushan", 45);
		Student student4 = new Student(12, "vivek", 75);
		Student student6 = new Student(51, "bhushan", 45);
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		hashSet.add(student6);
		System.out.println(hashSet);
//		Iterator<Student> iterator = hashSet.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		ArrayList<Student> arrayList = new ArrayList<>(hashSet);
//		Collections.sort(arrayList,new SortByName());
//		System.out.println("===========");
//		Iterator<Student> iterator2 = arrayList.iterator();
//		while(iterator2.hasNext())
//		{
//			System.out.println(iterator2.next());
//		}
	}
}
