package com.te.map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {// for mapping
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Ramya");
		hashMap.put(2, "sunny");
		hashMap.put(3, "jaquee");
		hashMap.put(2, "emmy");/// here the second object is getting overided
		Set<Integer> keySet = hashMap.keySet();
//		for (Integer i : keySet) {
//			System.out.println("Keys :"+i+" Value:"+hashMap.get(i));//we can use both the methods 
//		}
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for (Entry<Integer, String> s : entrySet) {
			System.out.println(s);
		}
	}  
}
	