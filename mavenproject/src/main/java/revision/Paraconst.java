package revision;

public class Paraconst {
	int a,b,c;
	public Paraconst(int a,int b)
	{
		c=a+b;
	}
	public void display()
	{
		System.out.println(c);
	}

	public static void main(String[] args) {
		Paraconst p=new Paraconst(7, 8);
		p.display();
		
	

	}

}
