package thiskeyword;

public class Thiskeyword {
	String name;
	int age;
	Thiskeyword(String name,int age) //constructor using this keyword
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("name; "+this.name);
		System.out.println("age; "+this.age);
	}

	public static void main(String[] args) {
		Thiskeyword t=new Thiskeyword("ashna",27);
		t.display();

	}

}
