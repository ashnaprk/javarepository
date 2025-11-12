package exceptionhandling;

public class ThrowsssException {

	public static void main(String[] args)throws VotingException { //customized exception
		
        int age=16;
        if(age<=18)
        {  
        	 throw new VotingException("voting age is above 18");
        	//System.out.println("not eligible for vote");
        }
        else
        {
        	System.out.println("Eligible for vote ");
        }
	}

}
