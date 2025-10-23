package workout1;

public class Methodstatic {
	public static void add()
	{     int a=8,b=9;
		
		int c= a+b;
		System.out.println(c);
	}
 
	public static void mult(int a,int b)
	{ 
		int c=a*b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
        Methodstatic.add();
        Methodstatic.mult(1, 5);
	}

}
