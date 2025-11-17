package methodoveride;

public class Dog extends Animal{
	public void sound() //overides parent class method
	{
		System.out.println("Dog Barks");
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound(); //calls method that overides
				

	}

}
