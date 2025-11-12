package exceptionhandling;

public class Multicatch {

	public static void main(String[] args) {
	    try
	    {
	   	
		int num []=new int[3];
		num[3]=2/0;
	    }
        catch(ArrayIndexOutOfBoundsException e)
	    {
        	System.out.println("Array index out of bound" + e);	
	    }
	    catch(ArithmeticException e)
	    {
	    	System.out.println("Arithmetic Exception" +e);
	    }
	}
	
	

}
