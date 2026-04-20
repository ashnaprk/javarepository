package placementsession;

public class StringMethods {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="hello world";
		String s3="java";
		String s4="PROGRAM";
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s1.charAt(0));
		System.out.println(s3.startsWith("ja"));
		System.out.println(s3.endsWith("va"));
		int n=100;
        String a=String.valueOf(n);
        System.out.println(a);

	}

}
