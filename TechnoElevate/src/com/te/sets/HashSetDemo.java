package com.te.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(45);
		set.add(35);
		for (int x : set)// here I am printing in both foreach loop and using iterator
		{
			System.out.println(x);
		}
		System.out.println("=========");
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
