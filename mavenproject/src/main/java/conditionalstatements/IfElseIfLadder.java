package conditionalstatements;

public class IfElseIfLadder {

	public static void main(String[] args) {
		int mark=70;
		if(mark>=90)
		{
			System.out.println("GRADE A");
		}
		else if(mark>=75)
		{
			System.out.println("GRADE B");
		}
		else if(mark>=60)
		{
			System.out.println("GRADE C");
		}
		else if(mark>=50)
		{
			System.out.println("GRADE D");
		}
		else
		{
			System.out.println("FAIL");
		}

	}

}
