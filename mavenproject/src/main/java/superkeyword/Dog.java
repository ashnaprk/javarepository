package superkeyword;

public class Dog extends Animal{
	public void sound()
	{
		System.out.println("Dog barks");
	}
	public void show()
	{
		super.sound(); //calling parent class sound using super keyword
		sound();       // calling current class sound
		
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.show();
	}

}
