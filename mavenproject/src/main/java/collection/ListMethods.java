package collection;

import java.util.LinkedList;
import java.util.List;

public class ListMethods {        //list methods

	public static void main(String[] args) {
		List<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(6);
		l.add(8);
		l.add(7);                  //duplicates value can add in list
		l.add(4);
		System.out.println(l);
		System.out.println(l.get(2));
		l.set(0, 4);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		l.remove(3);
		System.out.println(l);
		System.out.println(l.contains(6));
		System.out.println(l.indexOf(8));
		System.out.println(l.lastIndexOf(4));
		
		
	}

}
