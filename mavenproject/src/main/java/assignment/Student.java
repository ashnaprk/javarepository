package assignment;

public class Student {    //AGGREGATION HAS A RELATIONSHIP
	String name;
	int rollno;
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
	}
	public void display()
	{
		System.out.println("Student Name: " +name);
		System.out.println("Roll Number: " +rollno);
	}

}
