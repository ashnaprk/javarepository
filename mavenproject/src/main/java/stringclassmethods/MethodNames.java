package stringclassmethods;

public class MethodNames {
	

	public static void main(String[] args) {
		String s1="java";
		String s2="Java";
		String s3="java";
		String s4="JAVA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s1.startsWith("ja"));
		System.out.println(s1.startsWith("rt"));
		System.out.println(s1.endsWith("va"));
		System.out.println(s1.endsWith("er"));
		System.out.println(s1.charAt(2));
        int n=100;
        String a=String.valueOf(n);
        System.out.println(a);
	}

}
