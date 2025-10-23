package superkeyword;

public class Child extends Parent {
 
	int a=20;
	public void display()
	{
		System.out.println("child instance " +a);
		System.out.println("parent instance using super keyword " +super.a);
	}
	public static void main(String[] args) {
	 Child c=new Child();
	 c.display();
	}

}
