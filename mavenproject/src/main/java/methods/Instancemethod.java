package methods;

public class Instancemethod {
	       
	public void display(String name) //instance variable declared inside a method
	{
		System.out.println("Ashna");
	}

	public static void main(String[] args) {
		Instancemethod s=new Instancemethod(); //object needed
		s.display("ashna");

	}

}
