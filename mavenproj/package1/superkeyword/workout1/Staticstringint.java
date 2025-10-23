package workout1;

public class Staticstringint {
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	public static String name(String x,String y)
	{
		return x +" "+y;
	}

	public static void main(String[] args) {
		System.out.println(add(8,4));
		String nam=name("as", "null");
		System.out.println(nam);

	}

}
