package collectionassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNo {

	public static void main(String[] args) {
		ArrayList<Integer> o=new ArrayList<Integer>();
		o.add(1);
		o.add(3);
		o.add(5);
		o.add(7);
		o.add(9);
		o.add(11);
		System.out.println(o);
		Iterator<Integer> i=o.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
