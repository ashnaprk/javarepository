package revision;


public class Dod extends Animal{
	public void bark()
	{
		System.out.println("Dog can bark");
	}

	public static void main(String[] args) {
		Dod d=new Dod();
		d.bark();
		d.eat();

	}

}
