package workout1;

public class Overload {
	public static void meth()
	{
		System.out.println("hello");
	}
    public static void meth(int x,int y)
    {
    	int z=x+y;
    	System.out.println(z);
    }
    public static void meth(int a,float b)
    {
    	float c=a*b;
    	System.out.println(c);
    }
	public static void main(String[] args) {
		
      Overload.meth();
      Overload.meth(5, 10);
      Overload.meth(6, 8.6f);
	}

}
