package constructor;

public class Defaultconst {
	String name;
	int age;
	Defaultconst()
	{
		name="ashna";
		age=27;
		
	}
	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
	

	public static void main(String[] args) {
		Defaultconst d=new Defaultconst();//when object created the default constructor is called automatically
		d.display();
		

	}

}
