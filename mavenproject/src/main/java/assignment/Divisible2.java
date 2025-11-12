package assignment;

public class Divisible2 extends Divisible {
	public void check()
	{
		
		int result=super.add();
		System.out.println("Addition Result " +result);
		if(result%10==0)
		{
			System.out.println("Divisible by 10");
		}
		else
		{
			System.out.println("Not divisible by 10");
		}
		
	}

	public static void main(String[] args) {
		Divisible2 d=new Divisible2();
		d.check();

	}

}
