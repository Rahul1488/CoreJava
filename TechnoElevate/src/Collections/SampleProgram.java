package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;

public class SampleProgram {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("string");
		c.add(10);
		c.add('a');
		c.add(10.10);
		c.add(true);
		c.add(null);
		Iterator  iterator =  c.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		ArrayList list = new ArrayList();
		list.add(20);
		list.add("anything");
		System.out.println(c.contains(20));
		list.clear();
		System.out.println(c);
		System.out.println(c.size());
		System.out.println("The list container = "+list.isEmpty());
		System.out.println("The c container = "+c.isEmpty());
	}
}
