package revision;

public class Poly {
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
		
	}
	public void sub(double a,double b)
	{
		double c=a-b;
		System.out.println(c);
	}
	public void sub()
	{
		System.out.println("SUB");
		
	}
	

	public static void main(String[] args) {
		Poly p=new Poly();
		p.sub();
		p.sub(6, 9);
		p.sub(5.8, 3.2);
		

	}

}
