package assignment;

public class Palindrome {
	public static void check1(String str)
	{ 
		 String rev="";
		 
		for(int i=str.length()-1;i>=0;i--)
			rev=rev+str.charAt(i);

            if(rev.equals(str))
    		{
    	        System.out.println(str + " is a palindrome");
    
    		}
             else
             {
    	      System.out.println(str +" is not pallindrome");
             }
	}
       public static void main(String[] args) {
		String str1="MALAYALAM";
		String str2="JAVA";
		check1(str1);
		check1(str2);
	}
	
	}


