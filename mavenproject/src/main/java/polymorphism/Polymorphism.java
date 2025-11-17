
package polymorphism;

public class Polymorphism {
	public void add(int a,int b)  //method overloading
	{
		int c=a+b;
		System.out.println("Sum= "+c);
	}
	public void add(double a,double b)
	{
		double c=a+b;
		System.out.println("Sum= "+c);
	}
	public void add()
	{
		System.out.println("Sum");
	}

	public static void main(String[] args) {
		
		Polymorphism n=new Polymorphism();
		n.add();
		n.add(4,5);
		n.add(6.8,9.3);
		

	}

}
//polymorphism by method overloading