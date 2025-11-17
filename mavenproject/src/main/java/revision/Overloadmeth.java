package revision;

public class Overloadmeth {
	public void add()
	{
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println(c);
	}
	public void add2(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add3(int a,int b,int c)
	{
		int d=a*b*c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		Overloadmeth o=new Overloadmeth();
		o.add();
		o.add2(6, 6);
		o.add3(8, 2, 5);

	}

}
