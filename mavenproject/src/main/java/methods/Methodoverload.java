package methods;

public class Methodoverload {
	public void add(int a,int b) //two parameters same method
	{
		int c=a+b;
		System.out.println("sum of a+b; "+c); //three parameters same method
	}
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("Sum of a+b+c; "+d);
	}

	public static void main(String[] args) {
		Methodoverload m=new Methodoverload();
		{
			m.add(4, 8);
			m.add(1, 5, 9);
		}
		
				
		

	}

}
