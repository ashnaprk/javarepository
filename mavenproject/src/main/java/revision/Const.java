package revision;

public class Const {
	int a,b,c;
	public Const()
	{
		a=6;
		b=7;
		c=a+b;
	}
	public void display()
	{
		System.out.println("c= " +c);
	}

	public static void main(String[] args) {
		Const obj=new Const();
		obj.display();

	}

}
