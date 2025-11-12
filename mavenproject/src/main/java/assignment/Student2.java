package assignment;

public class Student2 {      //AGGREGATION HAS A RELATIONSHIP
	String address;
	Student reference;
	Student2(String address,Student reference)
	{ 
		this.address=address;
		this.reference=reference;
		
	}
	public void display2()
	{
		
	    reference.display();
	    System.out.println("Address: "+address);
		
	}
	
	public static void main(String[] args) {
		Student obj1=new Student("Ashna",45);
		Student2 obj2=new Student2("132 XYZ Alappuzha", obj1);
		obj2.display2();
		
		
	}

}
