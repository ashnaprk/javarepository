package test;

public class Const {
	int num1,num2,c;//instance variable
	Const(int a,int b)
	{    
		num1=a;
		num2=b;
		c=num1+num2;	
	}
public void display()
{
	System.out.println(c);
}
	public static void main(String[] args) {
		Const c=new Const(9,7);
		c.display();
		

	}

}
