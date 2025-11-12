package exceptionhandling;

public class ExceptionHandle {

	public static void main(String[] args) {
		try                 // try is there catch is necessary
		{
		
		int num=10/0;
		System.out.println(num);
		}
		catch(Exception e)  //if we don't know which exception then direct write Exception
		{                   // here its Arithmetic exception
			System.out.println(e);
		}
		finally             //finally will work in any case
		{
			System.out.println("finally block executed");
		}
	}

}
