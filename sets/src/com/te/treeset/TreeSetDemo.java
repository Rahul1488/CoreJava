package com.te.treeset;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Object> set = new TreeSet<>();
		set.add(10);
		set.add(35);
		set.add(52);
		set.add(2);
		set.add(39);
//		for (Object Obj : set) {
//			System.out.println(Obj);
//		}
//		System.out.println("============");
		ArrayList arrayList = new ArrayList(set);
		ListIterator<Integer> listIterator = arrayList.listIterator(arrayList.size());
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}

	}
}
