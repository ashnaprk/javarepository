package aggregation;

public class ClassB {
	String name,location;
	ClassA reference;   //ENITY REFERENCE this is Aggregation
    ClassB(String name,String location,ClassA reference)
    {
    	this.name=name;
    	this.location=location;
    	this.reference=reference;
    	
    }
    public void display2()
    {
    	System.out.println("Name= "+name);
    	System.out.println("Location= "+location);
    	reference.display();
    }
	public static void main(String[] args) {
		ClassA obj1=new ClassA("KOCHI","INDIA");
		ClassB obj2=new ClassB("ASHNA","ALAPPUZHA",obj1);
		obj2.display2();
	}

}
