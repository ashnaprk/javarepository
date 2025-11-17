package returninjava;

public class Returntype {
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
		
	}

	public static void main(String[] args) {
		Returntype r=new Returntype();
		int result=r.add(4, 7);
		System.out.println(result);
		
       
	}

}
