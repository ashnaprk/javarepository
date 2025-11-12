package test; //this keyword with constructor

public class Student {
	String name;
	int id;
	Student(String name,int id) //constructor
	{
		this.name=name;
		this.id=id;
	}
    public void display()
    {
    	System.out.println("name= " +this.name);
    	System.out.println("id= " +this.id);
    }
	public static void main(String[] args) {
	Student s=new Student("ashna",8);//constructor value
	s.display();

	}
//this keyword refer to the instance variable name of current object
}
