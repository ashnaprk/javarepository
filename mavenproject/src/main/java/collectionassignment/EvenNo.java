package collectionassignment;

import java.util.ArrayList;

public class EvenNo {

	public static void main(String[] args) {
		ArrayList<Integer> e=new ArrayList<Integer>();
		e.add(2);
		e.add(4);
		e.add(6);
		e.add(8);
		e.add(10);
		e.add(12);
		System.out.println(e);
		e.remove(3);
		System.out.println("Elements after removingvalue at index 3 " +e);
		

	}

}
