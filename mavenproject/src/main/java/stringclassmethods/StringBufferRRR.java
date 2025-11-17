package stringclassmethods;

public class StringBufferRRR {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("hello");
		s.append("world");
		System.out.println(s);
		s.insert(4, "world");
		System.out.println(s);
		s.delete(1, 3);
		System.out.println(s);
		s.replace(1, 3, "world");
		
	

	}

}
