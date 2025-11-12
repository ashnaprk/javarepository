package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iteratorss {

	public static void main(String[] args) {
		List<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(0);
		l.add(45);
		l.add(12);
		System.out.println(l);
		Iterator<Integer> t=l.iterator();
		while(t.hasNext())             
		{
			System.out.println(t.next());
		}
		
        t.remove();            //last element removed
        System.out.println(l);
	}

}
