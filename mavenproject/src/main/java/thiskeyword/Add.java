package thiskeyword;

public class Add {
	int a,b,c;
	public void add1(int a,int b) //this keyword with method
	{  
		this.a=a;
		this.b=b;
		this.c=a+b;
		
	}
	public void display()
	{
		System.out.println("sum= "+this.c);
	}

	public static void main(String[] args) {
		Add obj=new Add();
		obj.add1(6, 8);
		obj.display();
		

	}

}
