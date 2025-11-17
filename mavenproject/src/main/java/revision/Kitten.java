package revision;

public class Kitten extends Cat {
	public void meow()
	{
		System.out.println("Kitten makes Meow");
	}

	public static void main(String[] args) {
		Cat c=new Kitten();//upcasting
		c.meow();

	}

}
