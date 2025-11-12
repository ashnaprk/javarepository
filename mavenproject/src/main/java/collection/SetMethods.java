package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		Set<Integer> s2=new HashSet<Integer>();
		s1.add(2);
		s1.add(4);       //duplicate values not allowed in set
		s1.add(8);       //unordered because list value be ascending or as wish of complier
		s1.add(1);
		s2.add(6);
		s2.add(3);
		s2.add(10);
		s2.add(7);
		System.out.println(s1);
		System.out.println(s2);
		s1.addAll(s2);
		System.out.println(s1);
		System.out.println("set s1 size " +s1.size());
		System.out.println("set s1 size " +s2.size()); //set2 still exits there
		System.out.println("set s2 is empty: " +s2.isEmpty());
		System.out.println("set1 contains 4: " +s1.contains(4));
		System.out.println(s1.containsAll(s2)); //set1 has set2
		System.out.println(s2.containsAll(s1)); //set2 doesn't have set1
		s2.remove(6);
		System.out.println("set2 6 is removed "+s2);
		s1.removeAll(s2);
		System.out.println("set1 "+s1);
		s2.clear();
		System.out.println("set2 cleares " +s2);
		
	}
}
