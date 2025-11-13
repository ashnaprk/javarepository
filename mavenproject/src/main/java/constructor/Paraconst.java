package constructor;

public class Paraconst {
	String name;
	int age;
	Paraconst(String n,int a)
	{  
		name=n;
		age=a;
		
	}
	public void diaplay()
	{
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
	}

	public static void main(String[] args) {
		Paraconst p=new Paraconst("ashna",27);//passing values while creating object
		p.diaplay();

	}

}
