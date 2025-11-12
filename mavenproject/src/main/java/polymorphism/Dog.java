package polymorphism;

public class Dog extends Animal {
	public void sound()
	{
		System.out.println("dog barks");
	}

	public static void main(String[] args) {
		Dog d=new Dog();//normal invoking of child class
		d.sound();
		Animal d2=new Dog(); //upcasting using polymorphism(child class is invoked)
		d2.sound();
		

	}

}
