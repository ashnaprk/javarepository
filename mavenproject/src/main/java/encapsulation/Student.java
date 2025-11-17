package encapsulation;

public class Student {
	private String name;
	private int age;
	public void setdetails(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	public String getdetails1()
	{
		return name;
		
	}
	public int getdetails2()
	{
		return age;
		
	}

}
