package abstractinterface;

public class Car implements Vechicle{
	public void model()   //method override
	
	{
		System.out.println("Model:MG Hector");
	}
	public void engine()  //method override
	{
		System.out.println("Engine:Hybrid");
	}
	public static void main(String[] args) {
		Car c=new Car();   //child class object 
		c.model();
		c.engine();
		
	}

}
