package methods;

public class Staticmethod {
	public static int add(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
	
		int result=Staticmethod.add(8, 6); //no object needed
		System.out.println(result);
		

	}

}
