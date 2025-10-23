package superkeyword;

public class Son extends Father {
	public void display() // method overidding same method name of parent class
	{
		System.out.println("the child class");
	}
    public void show() //childclass method used to call parent class
    {
    	display();
    	super.display();
    }
	public static void main(String[] args) {
		Son c=new Son();
		c.show();
	}

}
// this,suoer will not function inside static method