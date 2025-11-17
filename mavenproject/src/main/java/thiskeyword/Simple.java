package thiskeyword;

public class Simple { //example program
	public Simple()
	{
		this(4,8);
		System.out.println("class constructor");
	}
	public Simple(int x,int y)
	
	{   int z=x*y;
		System.out.println("z= "+z);
	}

	public static void main(String[] args) {
		Simple s=new Simple();



	}

}
