package revision;

public class Add {
	int a,b;
	public Add(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public void display()
	{
		System.out.println("a= "+this.a);
		System.out.println("b= "+this.b);
	}

	public static void main(String[] args) {
		Add d=new Add(2,4);
		d.display();
		

	}

}
