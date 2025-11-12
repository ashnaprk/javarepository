package assignment;

import java.util.Scanner;


public class Payment {
	double basic,deduction,bonus;
	public void details()
	{ 
		
		
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter Basic Pay");
			basic=sc.nextDouble();
			System.out.println("Enter Deduction");
			deduction=sc.nextDouble();
			System.out.println("Enter Bonus");
			bonus=sc.nextDouble();
			sc.close();
			
		
	}

}
