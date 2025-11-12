package assignment;

import java.util.LinkedList;
import java.util.List;

public class ListAssignment {
	
	public static void main(String[] args) {
		List<String> s=new LinkedList<String>();
		s.add("Ram");
		s.add("Sanu");
		s.add("Arjun");
		s.add("Krishna");
		s.add("Vivek");
		s.add("Gopu");
		System.out.println("Names in the List");
		for(String name : s)                 //for each loop
		{
			System.out.println(name);
		}
		

	}

}
