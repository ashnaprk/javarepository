package abstractprg;

public class ClassB1 extends ClassA1{
	public void student() //overide happens - here the needed things
	{
		System.out.println("ClassB1 extends ClassA1");
	}


public static void main(String[] args) {
	ClassB1 b=new ClassB1();   //only child class can create object 
	b.student();
	b.school();
	

}
}//abstract class can't create object 