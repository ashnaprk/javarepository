package stringclassmethods;

public class StringBuliderrr {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("hello");
		s.append("world");
		System.out.println(s);
		s.insert(4, "gogo");
		System.out.println(s);
		s.delete(3, 6);
		System.out.println(s);
		s.replace(1, 3, "bla");
		System.out.println(s);

	}

}
