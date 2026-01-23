package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericlist {

	public static void main(String[] args) {
		List s=new ArrayList(); //non-generic list
		s.add("Ram");
		s.add("Sanu");
		s.add("Arjun");
		s.add("Krishna");
		s.add("Vivek");
		s.add("Gopu");
		System.out.println("Names in the List");
		for(Object name : s)                 //for each loop
		{
			System.out.println(name);
		}
		

	}


	}


