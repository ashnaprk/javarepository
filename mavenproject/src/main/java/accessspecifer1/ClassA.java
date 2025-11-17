package accessspecifer1;

public class ClassA {
	public int pub=10;
	private int pri=20;
	protected int pro=30;
	int def=40;
	public void publicmeth()
	{
		System.out.println("public method");
	}
	public void privatemeth()
	{
		System.out.println("private method");
	}
	public void protectmeth()
	{
		System.out.println("Protect method");
	}
	public void defaultmeth()
	{
		System.out.println("Default");
	}

}
