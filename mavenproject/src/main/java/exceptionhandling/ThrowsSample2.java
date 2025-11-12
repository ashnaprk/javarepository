package exceptionhandling;

public class ThrowsSample2 {

	public static void main(String[] args)throws VoteException {
		int age=12;
		if(age>=18)
		{
			System.out.println("elgible for vote");
		}
		else
		{  throw new VoteException("voting age above 18");
			//System.out.println("not eligible for vote");
		}

	}

}
