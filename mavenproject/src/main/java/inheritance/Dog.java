package inheritance;

public class Dog extends Animal{
	
	public void bark() 
	{
		System.out.println("dog can bark");
	}
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();
	

	}

}

//through single single inheritance parent class is inherited to child class