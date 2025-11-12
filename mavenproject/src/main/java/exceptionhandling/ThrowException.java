package exceptionhandling;

public class ThrowException {

	public static void main(String[] args) {
		int age=16;
		if(age<=18)
		{   
			throw new ArithmeticException("age under 18");
			//System.out.println("Not Eligible for Vote");
		}
		else
		{   
			System.out.println("Elgible for Vote");
		}
	}

}
